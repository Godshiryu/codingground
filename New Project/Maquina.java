public abstract class Maquina {
    private String localizacao;
    private int id_maquina;

    public Maquina(String localizacao, int id) {
        if(localizacao.equals("America") || localizacao.equals("Europa") || localizacao.equals("Africa") || localizacao.equals("Asia") || localizacao.equals("Oceania")){
            this.localizacao = localizacao;
            this.id_maquina = id_maquina;
        }
        else{
            throw new UnsupportedOperationException("Esta localizacao nao existe");
        }
        
    }
       
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(int id_maquina) {
        this.id_maquina = id_maquina;
    }
    
    
    
    
}
