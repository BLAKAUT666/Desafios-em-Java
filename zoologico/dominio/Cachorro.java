package zoologico.dominio;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String emitirSom(){
        System.out.println("----- Cachorro -----");
        return "AU AU AU AU";
    }
}
