package cookies;
public class Pedido extends PedidoCookie {

	private PedidoCookie cookies[];
	
	public Pedido(String sabor, int quantidadeCaixas) {
		super(sabor, quantidadeCaixas);
		// TODO Auto-generated constructor stub
	}

	public PedidoCookie[] getCookies() {
		return cookies;
	}

	public void setCookies(PedidoCookie cookies[]) {
		this.cookies = cookies;
	}
	
}