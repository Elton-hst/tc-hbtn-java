package produtos;

public abstract class Produto {

    protected String titulo;
    protected int ano;
    protected String pais;
    protected double precoBruto;

    public Produto(){

    }

    public abstract double obterPrecoLiquido(double preco);

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public double getPrecoBruto() {
        return precoBruto;
    }
    public void setPrecoBruto(double precoBruto) {
        this.precoBruto = precoBruto;
    }

}