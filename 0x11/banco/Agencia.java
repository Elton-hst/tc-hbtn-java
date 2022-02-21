import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia() {
    }

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    } 

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {

        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial){
        Cliente cliente = buscarCliente(nomeCliente);
        if (cliente != null){
            return false;
        }
        Cliente novoCliente = new Cliente(nomeCliente, valorTransacaoInicial);
        clientes.add(novoCliente);
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomecliente, double valorTransacao){
        Cliente cliente = buscarCliente(nomecliente);
        if (cliente != null){
            cliente.adicionarTransacao(valorTransacao);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String clienteBuscado){
        for (Cliente cliente : clientes) {
            if(cliente.getNome().equals(clienteBuscado)) {
                return cliente;
            }
        }
        return null;
    }

}