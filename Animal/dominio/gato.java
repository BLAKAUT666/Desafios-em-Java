package Exerciceos.Animal.dominio;

public class gato extends Animal{
    private String raca;

    // construtor in gato
    public gato(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    //metodo in barulho do gato
    public void fazerBarulho(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Raça: " + this.raca);
        super.fazerBarulho();
        System.out.println("MIAU-MIAU-MIAU-MIAU");
    }

    // raca gato
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }
}
