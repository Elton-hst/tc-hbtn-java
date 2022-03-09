import java.util.HashMap;
import java.util.Map;

public class Armazem<T> implements Armazenavel<T>{

    Map<String, T> armazem = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        armazem.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return armazem.get(nome);
    }

}