public class Autor implements Comparable<Autor> {
    private String nome;
    private String sobrenome;
    
    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nome, sobrenome);
    }

    @Override
    public int compareTo(Autor o) {
        return this.toString().compareTo(o.toString());
    }
}