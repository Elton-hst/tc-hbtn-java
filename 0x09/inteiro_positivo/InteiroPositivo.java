
public class InteiroPositivo {

	private int valor;
	private int contador = 0;

	public InteiroPositivo(int valor) {
		this.valor = validarPositivo(valor);

	}

	public InteiroPositivo(String valor) {
		this.valor = validarPositivo(Integer.valueOf(valor));
	}

	private int validarPositivo(int valor) {
		if (valor > 0) {
			return valor;
		} else {
			throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
		}
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = validarPositivo(valor);
	}

	public boolean ehPrimo() {
		for (int i = 1; i <= valor; i++) {
			if (valor % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			return true;
		}
		return false;
	}
}