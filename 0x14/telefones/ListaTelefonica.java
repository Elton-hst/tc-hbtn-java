import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    
    private HashMap<String, ArrayList<Telefone>> hashMapTelefone;

    public ListaTelefonica() {
        this.hashMapTelefone = new HashMap<>();
    }


    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> telefones = hashMapTelefone.get(nome);

        if(telefones == null) {
            telefones = new ArrayList<>();
            telefones.add(telefone);
            hashMapTelefone.put(nome, telefones);
        } 
        else {
            telefones.add(telefone);
        }
    } 

    public ArrayList<Telefone> buscar(String nome) {
        return hashMapTelefone.get(nome);
    }
    
}
