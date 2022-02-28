
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produto, Predicate<Produto> predicate){
        List<Produto> produtoList = new ArrayList<>();
        produto.forEach(p -> {
            if (predicate.test(p)){
                produtoList.add(p);
            }
        });

        return produtoList;
    }
}