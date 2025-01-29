package teste;
import dominio.*;

public class testeSistema{
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Alexandre", 0, "Xandisaque@gmail.com", "1194293-3452");
        NotificacaoSMS sms = new NotificacaoSMS();
        NotificacaoGmail gmail = new NotificacaoGmail();
        sms.mensagem("Óla, meu nobre, como vai a vida, tudo bem ?", usuario);
        gmail.mensagem("Seu produto chegou na sua casa hoje de manha", usuario);

    }
}
