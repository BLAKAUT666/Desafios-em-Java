package Exerciceos.figuraGeometrica.teste;

import Exerciceos.figuraGeometrica.dominio.Circulo;
import Exerciceos.figuraGeometrica.dominio.Retangulo;

public class figuraTeste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4, 10);
        Retangulo retangulo = new Retangulo(4, 3);

        System.out.println("-------- Retangulo");
        retangulo.calcularArea();
        retangulo.imprimi();

        System.out.println("------- Circulo");
        circulo.calcularArea();
        circulo.imprimi();

    }
}
