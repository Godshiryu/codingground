public class Requisicao extends Decorator {
    
    private Pacote pacote;

    public Requisicao(Pacote pacote, String pais, String requisicao, int ip_maquina) {
        super(pais, requisicao, ip_maquina);
        this.pacote = pacote;
    }
    
    public void Requisicao(){
        this.setPedido("Requerindo");
    }
    
    
}
