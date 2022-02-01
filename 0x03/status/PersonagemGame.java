public class PersonagemGame {

    private String nome;
    private int saudeAtual;
    private String status;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSaudeAtual() {
        return saudeAtual;
    }
    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(saudeAtual > 0) {
            this.status = "vivo";
        }else {
            this.status = "morto";
        }
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    public void tomarDano(int quantidadeDeDano) {
		this.saudeAtual = saudeAtual - quantidadeDeDano;
		this.setSaudeAtual(saudeAtual);
		if(saudeAtual < 0) {
			saudeAtual = 0;
		}	
	}

	public void receberCura(int quantidadeDeCura) {
		this.saudeAtual = saudeAtual + quantidadeDeCura;
		this.setSaudeAtual(saudeAtual);
		if(saudeAtual > 100) {
			saudeAtual = 100;
		}
	}
}