package dominio;

public class Usuario{
    private String nome;
    private int idade;
    private String gmail;
    private String telefone;

    public Usuario(String nome, int idade, String gmail, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.gmail = gmail;
        this.telefone = telefone;
        verificandoDados();
    }

    // verificando the gmail, name and age
    public void verificandoDados(){
        if(gmail == null || nome == null || idade <= 0 || telefone == null){
            System.out.println("Campos invalidos, tente novamente");
            return;
        }
    }

    @Override
    public String toString(){
        return "Usuario{  " +
            "Nome: " + getNome() + " , " +
            " Idade:" + getIdade() + " , " +
            " Gmail: " + getGmail() + " , " +
            " Telefone: " + getTelefone() + " , " +
            " }";
    }

    // get in name, age, email and telefone
    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getGmail(){
        return this.gmail;
    }

    public String getTelefone(){
        return this.telefone;
    }
}
