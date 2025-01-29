package dominio;

public class NotificacaoGmail implements Notificacao{
    // metodo in interface
    @Override
    public void mensagem(String mensagem, Usuario usuario){
        System.out.println(mensagem + ", gmail{ " + usuario.getGmail() + " }");
    }
}
