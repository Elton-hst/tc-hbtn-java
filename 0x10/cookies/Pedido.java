import java.util.ArrayList;
import java.util.List;

public class Pedido {

	List<PedidoCookie> cookies = new ArrayList<>();
	
	public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
		this.cookies.add(pedidoCookie);
	}

    public int obterTotalCaixas() {
        return this.cookies.size();
    }
}