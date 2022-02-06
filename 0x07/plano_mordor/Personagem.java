import comida.Comida;
import humor.Feliz;
import humor.Humor;
import humor.Irritado;
import humor.MuitoFeliz;
import humor.Triste;

public class Personagem {

	private Humor humor;
	private String qualHumor;
	protected int pontosDeFelicidade;

	public String obterHumorAtual(int total) {
		if (total < -5) {
			humor = new Irritado();
			qualHumor = humor.getClass().getName();
		}

		if (total >= -5 && total <= 0) {
			humor = new Triste();
			qualHumor = humor.getClass().getName();
		}
		if (total >= 1 && total <= 15) {
			humor = new Feliz();
			qualHumor = humor.getClass().getName();
		}
		if (total > 15) {
			humor = new MuitoFeliz();
			qualHumor = humor.getClass().getName();
		}
		return qualHumor.replace("humor.", "");
	}

	public void comer(Comida[] comidas) {
		for (Comida comida : comidas) {
			pontosDeFelicidade += comida.getPontosDeFelicidade();
		}
	}

	@Override
	public String toString() {
		return pontosDeFelicidade + " - " + obterHumorAtual(pontosDeFelicidade);
	}

}