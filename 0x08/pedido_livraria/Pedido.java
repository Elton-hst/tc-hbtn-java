public class Pedido {
    
    private int percentualDesconto;
    private ItemPedido[] itens;
    private double total;

    public Pedido() {

    }

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        super();
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

	public double calcularTotal() {
		for (ItemPedido item : itens) {
			total += (item.getProduto().obterPrecoLiquido(item.getProduto().getPrecoBruto())*item.getQuantidade());
		}
		
		return total - (total * percentualDesconto / 100 );
	}

    public int getPercentualDesconto() {
        return percentualDesconto;
    }
    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
    public ItemPedido[] getItens() {
        return itens;
    }
    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }
    
}