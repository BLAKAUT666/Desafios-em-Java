package zoologico.dominio; public class Gato extends Animal{
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public String emitirSom(){
        System.out.println("----- Gato -----");
        return "MIAU MIAU MIAU MIAU";
    }
}
