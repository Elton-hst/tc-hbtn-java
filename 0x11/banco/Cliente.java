import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;
    
    public Cliente(String nome, double valorTransacaoInicial) {
        this.nome = nome;
        
        this.transacoes = new ArrayList<>();
        this.transacoes.add(valorTransacaoInicial);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacoes(double valorTransacao) {
        this.transacoes.add(valorTransacao);
    }
}
