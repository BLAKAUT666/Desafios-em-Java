package FormaGeometrica.dominio;

abstract class FormaGeometrica {
    protected String cor;
    protected double area;

    public FormaGeometrica(String cor, double area){
        this.cor = cor;
        this.area = area;
        calcularArea();
        calcularPerimetro();
    }

    // método calcula a area
    public abstract void calcularArea();

    // método calcula o perimetro
    public abstract void calcularPerimetro();
}
