package produtos;

public class Dvd extends Produto {
    
    private String diretor;
    private String gerero;
    private int duracao;

    public Dvd() {

    }

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String gerero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.gerero = gerero;
        this.duracao = duracao;
    }
    
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getGerero() {
        return gerero;
    }
    public void setGerero(String gerero) {
        this.gerero = gerero;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public double obterPrecoLiquido(double preco) {
        return getPrecoBruto() * 1.20;
    }

}
