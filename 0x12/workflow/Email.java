public class Email implements CanalNotificacao{

    public static final String template = "[%s] {%s} - %s";

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format(template, "EMAIL", mensagem.getTipoMensagem(), mensagem.getTexto()));
    }
}