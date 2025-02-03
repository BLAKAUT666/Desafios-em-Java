package zoologico.service;
import zoologico.dominio.*;

public class emit {
    public static void adicinar(Animal animal[]) {
       for(Animal i: animal){
           String som = i.emitirSom();

           System.out.println("Nome: " + i.getNome());
           System.out.println("Idade: " + i.getIdade() + " Anos");
           System.out.println("Som: " + som);
       }
    }
}
