package FormaGeometrica.dominio;

public class Quadrado extends FormaGeometrica{
    public Quadrado(String cor, double area){
        super(cor, area);
    }

    @Override
    public String toString(){
        return "Quadrado{ " +
                " Cor: " + this.cor + " , " +
                " Area: " + this.area +
                "  }";
    }

    @Override
    public void calcularPerimetro() {
        double result = area + area + area + area;
        System.out.println("Perimetro: " + result);
    }

    @Override
    public void calcularArea() {
        double result = area + area;
        System.out.println("area:" + result);
    }
}
