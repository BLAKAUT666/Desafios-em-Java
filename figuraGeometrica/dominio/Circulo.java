package Exerciceos.figuraGeometrica.dominio;

public class Circulo extends figuraGeometrica{
    public Circulo(double altura, double largura){
        super(altura, largura);
    }

    public void imprimi(){
        super.imprimi();
        System.out.println("Área: " + calcularArea());
    }

    // metodo calcular area
    public double calcularArea(){
        double pi = 314159;
        double a = altura / 2;
        double b = largura / 2;
        double result = pi * b * a;

        return result;
    }
}

