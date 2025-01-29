package dominio;

public class NotificacaoSMS implements Notificacao{
    @Override
    public void mensagem(String mensagem, Usuario usuario){
        System.out.println(mensagem + ", Telefone{ " + usuario.getTelefone()+ " }");
    }
}
