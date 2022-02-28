import java.util.*;

public class ConsultaProdutos {


    public static List<Produto> filtrar(List<Produto> produto, CriterioFiltro criterioFiltro) {
        List<Produto> produtos = new ArrayList<>();

        produto.forEach(p -> {
            if (criterioFiltro.testar(p)){
                produtos.add(p);
            }
        });

        return produtos;
    }

}