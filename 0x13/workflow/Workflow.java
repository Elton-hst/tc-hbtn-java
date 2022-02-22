import java.util.ArrayList;
import atividades.Atividade;
public class Workflow {

    private ArrayList<Atividade> atividades = new ArrayList<Atividade>();
    
    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }
}