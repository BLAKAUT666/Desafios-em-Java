package FormaGeometrica.dominio;

public class Circulo extends FormaGeometrica{
    public final double pi = 3.1459;

    public Circulo(String cor, double area){
        super(cor, area);
    }

    @Override
    public String toString(){
        return "Circulo{ " +
                " Cor: " + this.cor + " , " +
                " Area: " + this.area +
                " }";
    }

    @Override
    public void calcularArea() {
        double result = pi * area * area;
        System.out.println("Area: " + result);
    }

    @Override
    public void calcularPerimetro() {
        double c = 2 * pi * area;
        System.out.println("Perimetro: " + c);
    }
}
