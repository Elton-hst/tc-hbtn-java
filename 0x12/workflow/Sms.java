public class Sms implements CanalNotificacao{

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format("[SMS] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getTexto()));
    }
}
