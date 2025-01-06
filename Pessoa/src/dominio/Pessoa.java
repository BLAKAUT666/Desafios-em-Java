package dominio;

public class Pessoa {
    private int idade;
    private String nome;
    private String gmail;

    //construtor de Pessoa, inicia as variaveis nome, idade, gmail
    public Pessoa(String nome, int idade, String gmail){
        this.nome = nome;
        this.idade = idade;
        this.gmail = gmail;
    }

    // imprime os dados do usuario
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Email: " + this.gmail);
    }

    // set and get in all
    // nome
    public void setNome(String nome){ this.nome = nome; }
    public String getNome(){ return this.nome; }
    
    // gmail
    public void setGmail(String gmail){ this.gmail = gmail; }
    public String getGmail(){ return this.gmail; }

    // idade
    public void setIdade(int idade){
        //verificando a idade
        if(idade != 0){ this.idade = idade;}
        else if(idade <= 0){ System.out.println("Idade invalida"); idade = 0;}
    }
    public int getIdade(){ return this.idade; }
}
