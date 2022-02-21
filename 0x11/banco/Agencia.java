import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;
   
    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String nome) {
        for(Cliente c : clientes) {
            if (c.getNome().equals(nome)) {
                return c;
            }
        }

        return null;
    }  
    
    public boolean novoCliente(String nome, double valorTransacaoInicial) {
        Cliente cliente = buscarCliente(nome);
        if (cliente != null) 
            return false;

        clientes.add(new Cliente(nome, valorTransacaoInicial));
        return true;
    }

    public boolean adicionarTransacaoCliente(String nome, double valorTransacao) {
        Cliente cliente = buscarCliente(nome);
        if (cliente == null)
            return false;

        cliente.adicionarTransacoes(valorTransacao);
        return true;
    }
}