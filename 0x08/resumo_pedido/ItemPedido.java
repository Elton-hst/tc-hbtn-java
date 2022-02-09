import produtos.Produto;

public class ItemPedido {
	
	private Produto produto;
	protected int quantidade;
	
	public ItemPedido() {

	}
	
	public ItemPedido(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}