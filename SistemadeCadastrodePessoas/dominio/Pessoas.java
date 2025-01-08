package SistemadeCadastrodePessoas.dominio;

public class Pessoas {
    private String nome;
    private int idade;
    private String cpf;

    // recebe nome, idade, cpf da pessoa
    public Pessoas(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // set end get in nome, idade, cpf
    public void setNome(String nome){ this.nome = nome;}
    public String getNome(){ return this.nome; }

    // idade
    public void setIdade(int idade){ this.idade = idade; }
    public int getIdade(){ return this.idade; }

    // cpf
    public void setCpf(String cpf){ this.cpf = cpf; }
    public String getCpf(){ return this.cpf; }

}
