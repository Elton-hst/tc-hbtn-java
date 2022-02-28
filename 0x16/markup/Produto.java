import java.util.function.*;

public class Produto {

    private double preco;
    private String nome;
    private double percentualMarkUp = 0.1;

    Consumer<Double> atualizarMarkUp = preco -> percentualMarkUp = (preco/100);
    Supplier<Double> precoComMarkUp = () -> preco * (1 + percentualMarkUp);

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPercentualMarkUp() {
        return percentualMarkUp;
    }

}