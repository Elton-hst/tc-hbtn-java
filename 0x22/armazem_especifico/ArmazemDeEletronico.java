import java.util.HashMap;
import java.util.Map;

public class ArmazemDeEletronico extends Armazem<Eletronico> {

    private Map<String, Eletronico> armazenados = new HashMap<>();

    public ArmazemDeEletronico() {
    }

    @Override
    public void adicionarAoInventario(String nome, Eletronico valor) {
        super.adicionarAoInventario(nome, valor);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return super.obterDoInventario(nome);
    }

}