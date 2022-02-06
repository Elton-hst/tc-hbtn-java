package comida;

public abstract class Comida {

	protected int pontosDeFelicidade;

	public Comida() {
		
	}
	public Comida(int pontosDeFelicidade) {
		super();
		this.pontosDeFelicidade = pontosDeFelicidade;
	}

	public int getPontosDeFelicidade() {
		return pontosDeFelicidade;
	}

	public void setPontosDeFelicidade(int pontosDeFelicidade) {
		this.pontosDeFelicidade = pontosDeFelicidade;
	}
	
	
}
