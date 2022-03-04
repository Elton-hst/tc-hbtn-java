import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream()
                .filter(p -> p.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        List<Produto> produtoList = new ArrayList<>(produtos);
        return produtoList.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .findFirst().orElse(null);

    }


    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido) {

        List<Pedido> produtosPedido = new ArrayList<>(pedido);

        return produtosPedido.stream()
                .filter(p -> p.getProdutos()
                        .stream()
                        .anyMatch(cat -> cat.getCategoria() == CategoriaProduto.ELETRONICO))
                .collect(Collectors.toList());

    }
}