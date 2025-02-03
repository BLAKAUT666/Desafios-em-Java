package zoologico.dominio;

public class Vaca extends Animal{
    public Vaca(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String emitirSom(){
        System.out.println("----- Vaca -----");
        return "MUUU MUUU MUUU MUUU";
    }
}
