package FormaGeometrica.teste;
import FormaGeometrica.dominio.Circulo;
import FormaGeometrica.dominio.Quadrado;

public class formasGeometricasTeste {
    public static void main(String... args){
        Quadrado quadrado = new Quadrado("Azul", 4);
        System.out.println(quadrado);

        System.out.println("-------------------------");
        Circulo circulo = new Circulo("Vermelho", 5);
        System.out.println(circulo);
    }
}
