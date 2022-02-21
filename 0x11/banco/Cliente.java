import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente() {
    } 

    public Cliente(String nome, double transacao) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(ArrayList<Double> transacoes) {
        this.transacoes = transacoes;
    }

    public void adicionarTransacao(double transacao){
        transacoes.add(transacao);
    }

}