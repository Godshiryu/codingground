public class Resposta extends Decorator{
    
    private Pacote pacote;

    public Resposta(Pacote pacote, String pais, String requisicao, int ip_maquina) {
        super(pais, requisicao, ip_maquina);
        this.pacote = pacote;
    }
    
    public void Respondendo(){
        this.setPedido("Respondendo");
    }
    
    
    
}
