public class Cliente {

    private int codigo;
    private String nome;
    private boolean premiun;

    public Cliente(int codigo, String nome, boolean premiun) {
        this.codigo = codigo;
        this.nome = nome;
        this.premiun = premiun;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPremiun() {
        return premiun;
    }

    public void setPremiun(boolean premiun) {
        this.premiun = premiun;
    }
}