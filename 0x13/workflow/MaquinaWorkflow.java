public class MaquinaWorkflow {
    
    public void executar(Workflow workflow){
        workflow.getAtividades().forEach(atividade -> atividade.executar());
    }
}
