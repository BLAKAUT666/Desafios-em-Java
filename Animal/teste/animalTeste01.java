package Exerciceos.Animal.teste;
import Exerciceos.Animal.dominio.gato;
import Exerciceos.Animal.dominio.cachorro;

public class animalTeste01 {
    public static void main(String... args){
        cachorro cachorro = new cachorro("Golden retriever", 6, "Canina");
        gato gato = new gato("Chausie", 4, "Gatos");

        // cachorros
        System.out.println("-------- cachorros");
        cachorro.fazerBarulho();

        // gatos
        System.out.println("-------- gatos");
        gato.fazerBarulho();
    }
}
