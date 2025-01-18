package Exerciceos.Animal.dominio;

public class cachorro extends Animal{
    private String raca;

    public cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public void fazerBarulho(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Raça: " + this.raca);
        super.fazerBarulho();
        System.out.println("AU-AU-AU-AU-AU");
    }

    public void setRaca(String raca){ this.raca = raca; }
    public String getRaca(){ return this.raca; }
}
