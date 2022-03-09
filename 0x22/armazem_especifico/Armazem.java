import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> armazenados = new HashMap<>();

    public Armazem() {
    }

    public Map<String, T> getArmazenados() {
        return armazenados;
    }

    public void setArmazenados(Map<String, T> armazenados) {
        this.armazenados = armazenados;
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        armazenados.put(nome, valor);

    }

    @Override
    public T obterDoInventario(String nome) {
        return armazenados.get(nome);
    }
}