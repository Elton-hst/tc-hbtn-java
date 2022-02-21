import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome; 
    private ArrayList<Agencia> agencias;


    public Banco() {
    }

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public boolean adicionarAgencia(String nomeAgencia){
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia == null){
            Agencia novaAgencia = new Agencia(nomeAgencia);
            agencias.add(novaAgencia);
                return true;
            }
        return false;
        }


    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorInicial) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia == null){
            return false;
        }
        agencia.novoCliente(nomeCliente, valorInicial);
        agencia.adicionarTransacaoCliente(nomeCliente, valorInicial);
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null){
            agencia.adicionarTransacaoCliente(nomeCliente, valorTransacao);
            return true;
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);
       if( agencia == null){
           return false;
       }
       int clientesContador = 0;
        for (Cliente clienteEncontrado : agencia.getClientes()) {
            clientesContador++;
            System.out.println("Cliente: " + clienteEncontrado.getNome() + " [" + (clientesContador) + "]");

            if (imprimirTransacoes) {
                int transacaoContador = 0;
                for (double valorTransacao : clienteEncontrado.getTransacoes()) {
                    transacaoContador++;
                    System.out.println("  [" + (transacaoContador) + "] valor " + valorTransacao);
                }
            }

        }
        return true;
    }

    public Agencia buscarAgencia(String agenciaBuscada){
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(agenciaBuscada)){
                return agencia;
            }
        }
        return null;
    }
}