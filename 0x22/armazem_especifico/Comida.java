public class Comida {

    private String nome;
    private double calorias;
    private double preco;

    @Override
    public String toString() {
        return String.format("[%s] %f R$ %f", nome, calorias, preco);
    }

    public Comida(String nome, double calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
