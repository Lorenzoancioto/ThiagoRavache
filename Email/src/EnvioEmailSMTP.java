public class EnvioEmailSMTP implements EnviouDeEmail{
    @Override
    public void enviar(String destinatario, String mensagem){
        System.out.println("Enviando e-mail via SMTP para " + destinatario);
    }
}
