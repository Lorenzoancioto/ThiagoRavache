public class Notificador {
    private EnviouDeEmail enviouDeEmail;

    public Notificador(EnviouDeEmail enviouDeEmail){
        this.enviouDeEmail = enviouDeEmail;
    }

    public void notificar(String destinatario, String mensagem){
        enviouDeEmail.enviar(destinatario, mensagem);
    }
}
