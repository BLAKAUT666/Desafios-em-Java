public class Produtos{
    protected String nome;
    protected String descricao;
    protected double preco;

    public Produtos(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        verificarDados();
    }

    // bloco de inicializacao
    {
        System.out.println("\n ------- Loja Virtual --------");
    }

    // verifica os dados do CLiente
    private void verificarDados(){
        if(nome == null || descricao == null || preco <= 0){
            System.out.println("Campos invalidos, tente novamente! ");
            return;
        }
    }

    // imprime os dados do cliente
    @Override
    public String toString(){
        return "Produto{ " +
            " Nome: " + this.nome +
            " Descrição: " + this.descricao +
            " Preço: " + this.preco + " }";
    }
}
