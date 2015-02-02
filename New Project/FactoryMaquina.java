public class FactoryMaquina {
    public Maquina createMaquina(String tipo, int id, String localizacao){
        if(tipo.equals("Cliente"))
            return new Cliente(localizacao, id);
        
        else if(tipo.equals("Servidor"))
            return new Servidor(localizacao,id);
        
        else
            throw new UnsupportedOperationException("Esse tipo de máquina nao existe");
    }
}
