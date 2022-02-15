import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

	List<Tarefa> tarefas = new ArrayList<>();

	public ListaTodo() {

	}

	public ListaTodo(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	public void adicionarTarefa(Tarefa tarefaAdicionada) {

		for (Tarefa tarefa : tarefas) {
			if (tarefa.getIdentificador() == tarefaAdicionada.getIdentificador()) {
				throw new IllegalArgumentException(
						"Tarefa com identificador " + tarefaAdicionada.getIdentificador() + " ja existente na lista");
			}

			if (tarefaAdicionada.getDescricao().isEmpty() || tarefaAdicionada.getDescricao().equals("")) {
				throw new IllegalArgumentException("Descricao de tarefa invalida");
			}

		}
		tarefas.add(tarefaAdicionada);
	}

	public boolean marcarTarefaFeita(int tarefaFeita) {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getIdentificador() == tarefaFeita) {
				tarefa.setEstahFeita(true);
				return true;
			}
		}
		return false;
	}
	
	public boolean desfazerTarefa(int tarefaDesfeita) {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getIdentificador() == tarefaDesfeita) {
				tarefa.setEstahFeita(false);
				return true;
			}
		}
		return false;
	}

	public void desfazerTodas() {
		for (Tarefa tarefa : tarefas) {
			tarefa.setEstahFeita(false);
		}
	}

	public void fazerTodas() {
		for (Tarefa tarefa : tarefas) {
			tarefa.setEstahFeita(true);
		}

	}

	public void listarTarefas() {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.isEstahFeita()) {
				System.out.println("[X]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
			} else {
				System.out.println("[ ]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
			}

		}

	}

}