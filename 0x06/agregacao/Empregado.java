
public class Empregado {

	private String nome;
	private int codigo;
	private Endereco endereco;



	// Endereco empregado = new Endereco("Jane Doe", 1, endereco);
	public Empregado(String nome, int codigo, Endereco endereco) {
		this.nome = nome;
		this.codigo = codigo;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void apresentar() {
		System.out.println("Codigo: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.print("Pais: " + endereco.getPais());
		
	}
}