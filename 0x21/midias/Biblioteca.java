import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T>{

    private List<T> listaGenerica = new ArrayList<>();

    public void adicionarMidia( T midia) {
        listaGenerica.add(midia);
    }

    public List<T> obterListaMidias() {
        return listaGenerica;
    }
}