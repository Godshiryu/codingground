public class Pacote {
    private String pais;
    private String requisicao;
    private int ip_maquina;
    private String pedido;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRequisicao() {
        return requisicao;
    }

    public void setRequisicao(String requisicao) {
        this.requisicao = requisicao;
    }

    public int getIp_maquina() {
        return ip_maquina;
    }

    public void setIp_maquina(int ip_maquina) {
        this.ip_maquina = ip_maquina;
    }

    public Pacote(String pais, String requisicao, int ip_maquina) {
        this.pais = pais;
        this.requisicao = requisicao;
        this.ip_maquina = ip_maquina;
        
        if(requisicao.equals("pagina")){
            this.requisicao = "pagina";
        }
        
        else if(requisicao.equals("arquivo")){
            this.requisicao = "arquivo";
        }
        
        else
            throw new UnsupportedOperationException("Ese tipo de requisicao nao existe !");
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
    
    
    
}
