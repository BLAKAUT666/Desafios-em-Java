package Exerciceos.Animal.dominio;

public class Animal {
    protected String nome;
    protected int idade;

    // construtor animal
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerBarulho(){
        System.out.println("SOM DO BARULHO DO ANIMAL");
    }

    // nome with set and get
    public void setNome(String nome){ this.nome = nome; }
    public String getNome(){ return this.nome; }

    // idade with set and get
    public void  setIdade(int idade){ this.idade = idade; }
    public int getIdade(){ return this.idade; }
}
