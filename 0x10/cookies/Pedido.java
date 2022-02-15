import java.util.ArrayList;
import java.util.List;

public class Pedido {

	List<PedidoCookie> cookies = new ArrayList<>();
	private int numero;
	private double total;
	
	public Pedido() {

	}

	public Pedido(List<PedidoCookie> cookies, int numero) {
		this.cookies = cookies;
		this.numero = numero;
	}
	
	public List<PedidoCookie> getCookies() {
		return cookies;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
		this.cookies.add(pedidoCookie);
	}

	public int obterTotalCaixas() {
		int totalCaixas = 0;
		for(int i=0; i < cookies.size(); i++) {
			totalCaixas += cookies.get(i).getQuantidadeCaixas();
		}
			
		return totalCaixas;
	}

	public int removerSabor(String sabor) {
		int totalCaixas = 0;
		for(int i=0; i < cookies.size(); i++) {
			if(sabor.equals(cookies.get(i).getSabor())) {
				totalCaixas += cookies.get(i).getQuantidadeCaixas();
				cookies.remove(cookies.get(i));
			}
		}
		return totalCaixas;	
	}
		
}

