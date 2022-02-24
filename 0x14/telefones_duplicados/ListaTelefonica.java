import java.util.HashSet;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> hashMapTelefone;

    public ListaTelefonica() {

        this.hashMapTelefone = new HashMap<>();
    }

    public void adicionarTelefone1(String nome, Telefone telefone) {
        HashSet<Telefone> telefones = hashMapTelefone.get(nome);
        if (telefones == null) {
            telefones = new HashSet<>();
            telefones.add(telefone);
            hashMapTelefone.put(nome, telefones);
        } else {
            HashSet<Telefone> telefones1 = hashMapTelefone.get(nome);

            if (telefones1.contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }

            hashMapTelefone.forEach((nome2, telefones2) -> {
                telefones2.forEach(telefone2 -> {
                            if (nome2 != nome && telefone2.equals(telefone)) {
                                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                            }
                        }
                );
            });
            telefones1.add(telefone);

        }
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> telefones = hashMapTelefone.get(nome);
        if (telefones == null) {
            telefones = new HashSet<>();
            telefones.add(telefone);
            hashMapTelefone.put(nome, telefones);
        } else {
            HashSet<Telefone> telefones1 = hashMapTelefone.get(nome);
           if( telefones1.contains(telefone)){
               throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }

            hashMapTelefone.forEach((nome2, telefones2) -> {
               if( telefones2.contains(telefone) && !nome2.equals(nome) ){
                   throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
               }
            });

            HashSet<Telefone> tele = new HashSet<>(telefones);

            tele.add(telefone);
            hashMapTelefone.replace(nome,tele);
        }
    }

    public HashSet<Telefone> buscar(String nome) {
        return hashMapTelefone.get(nome);
    }
}