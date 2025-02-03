package zoologico.teste;
import zoologico.dominio.*;
import zoologico.service.emit;

public class zoologicoTeste01 {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro("Zeus", 4);
        Animal animal2 = new Vaca("Mirilis", 14);
        Animal animal3 = new Gato("Chigo", 2);
        Animal animal4 = new Pato("Simba", 5);
        Animal[] list = {animal1, animal2, animal3, animal4};

        emit.adicinar(list);
    }
}
