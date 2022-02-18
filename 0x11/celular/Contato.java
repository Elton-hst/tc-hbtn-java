public class Contato {

    private String nome;
    private String numero;
    private TipoNumero tipoNumero;
    
    public Contato() {

    }

    public Contato(String nome, String numero, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numero = numero;
        this.tipoNumero = tipoNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }
    
}
