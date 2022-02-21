public class Teams implements CanalNotificacao{

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format("[TEAMS] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getTexto()));
    }
}
