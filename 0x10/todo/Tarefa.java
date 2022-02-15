public class Tarefa {
    
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    //metodos
    public void modificarDescricao(String descricao) {
        if(descricao.isEmpty() || descricao == "") {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }else {
            this.descricao = descricao;
        }
    }
    //construtor
    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }
    //gets and setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isEstahFeita() {
        return estahFeita;
    }
    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
}
