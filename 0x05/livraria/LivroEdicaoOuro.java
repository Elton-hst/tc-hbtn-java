import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro {
	
	public LivroEdicaoOuro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
		super(titulo, autor, preco) ;
		// TODO Auto-generated constructor stub
	}

	public double getPreco() {
		return preco += preco*0.30f;
	}

}