public class Vacina { 
    
    private int lote;
    private String fabricante;
    private String descricao;

    //construtor padrão
    Vacina() {}

    Vacina(int lote, String fabricante, String descricao){
        setLote(lote);
        setFabricante(fabricante);
        setDescricao(descricao);
    }

    public int getLote() {
        return this.lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}