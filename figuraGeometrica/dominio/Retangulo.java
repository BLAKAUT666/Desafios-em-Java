package Exerciceos.figuraGeometrica.dominio;

public class Retangulo extends figuraGeometrica{
    public Retangulo(double altura, double largura){
        super(altura, largura);
    }

    public void imprimi(){
        super.imprimi();
        System.out.println("Área: " + calcularArea());
    }

    public double calcularArea(){
        double sum = largura * altura;
        return sum;
    }
}
