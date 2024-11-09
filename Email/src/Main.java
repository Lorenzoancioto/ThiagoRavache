public class Main {
    public static void main(String[] args) {
        EnviouDeEmail emailSMTP = new EnvioEmailSMTP();
        Notificador notificador = new Notificador(emailSMTP);
        notificador.notificar("cliente@exexplo.com", "Seu pedido foi enviado");
    }
}
