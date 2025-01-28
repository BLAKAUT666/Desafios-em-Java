
public class Clientes{
    protected String nome;
    protected String endereco;

    public Clientes(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        verificarDados();
    }

    public void verificarDados(){
        if(nome == null || endereco == null){
            System.out.println("Campos do cliente invalidos, tente novamente! ");
            return;
        }
    }
}
