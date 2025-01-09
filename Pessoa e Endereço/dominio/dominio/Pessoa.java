package dominio;

public class Pessoa{
    private String nome;
    private int idade;
    private Endereco endereco;
    
    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    
    public void imprimi(){
        System.out.println("--------------------------- \n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " Anos");

        if(endereco.getCidade() == null){  System.out.println("Cidade incorreta, tente novamente!"); }
        else{  System.out.println("Cidade: "+endereco.getCidade()); }

        if(endereco.getRua() == null){ System.out.println("Rua incorreta, tente novamente!");}
        else{ System.out.println("Rua: " + endereco.getRua());}

        if(endereco.getNumero() != 0){ System.out.println("Numero: "+endereco.getNumero());}
        else{System.out.println("Numero incorreto, tente novamente!");}
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}