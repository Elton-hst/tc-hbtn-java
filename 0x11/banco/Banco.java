import java.util.*;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nome) {
        for(Agencia a : agencias) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }

        return null;
    }

    public boolean adicionarAgencia(String nome) {
        Agencia agencia = this.buscarAgencia(nome);
        if (agencia != null)
            return false;

        this.agencias.add(new Agencia(nome));
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacaoInicial) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia == null)
            return false;
        
        Cliente cliente = agencia.buscarCliente(nomeCliente);
        if (cliente != null) 
            return false;

        agencia.novoCliente(nomeCliente, valorTransacaoInicial);
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia == null)
            return false;
        
        Cliente cliente = agencia.buscarCliente(nomeCliente);
        if (cliente == null) 
            return false;

        cliente.adicionarTransacoes(valorTransacao);
        return true;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia == null)
            return false;

        int cont = 1;
        for(Cliente c : agencia.getClientes()) {
            System.out.printf("Cliente: %s [%d]\n", c.getNome(), cont++);
        
            if (imprimirTransacoes) {
                int contTransacao = 1;
                for(double valorTransacao : c.getTransacoes()) {
                    System.out.printf("  [%d] valor %.2f\n", contTransacao, valorTransacao);
                }
            }
        }
        return true;
    }
}
