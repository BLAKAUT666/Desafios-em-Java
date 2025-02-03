package zoologico.dominio;

public class Pato extends Animal{
    public Pato(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String emitirSom(){
        System.out.println("----- Pato -----");
        return "QUA QUA QUA QUA";
    }
}
