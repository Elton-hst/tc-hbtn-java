import java.util.List;

public class ManipularArrayNumeros {

	public static int buscarPosicaoNumero(List<Integer> numeros, int num) {
		return numeros.indexOf(num);
	}

	public static void adicionarNumero(List<Integer> numeros, int num) {
		if (buscarPosicaoNumero(numeros, num) > -1) {
			throw new IllegalArgumentException("Numero jah contido na lista");
		}
		numeros.add(num);
	}

	public static void removerNumero(List<Integer> numeros, int num) {
		if (buscarPosicaoNumero(numeros, num) == -1) {
			throw new IllegalArgumentException("Numero nao encontrado na lista");

		}
		numeros.remove(buscarPosicaoNumero(numeros, num));
	}

	public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
		if (buscarPosicaoNumero(numeros, numeroSubstituir) == -1) {
			numeros.add(numeroSubstituto);
		}else {
			numeros.set(buscarPosicaoNumero(numeros, numeroSubstituir), numeroSubstituto);
		}
	}

}