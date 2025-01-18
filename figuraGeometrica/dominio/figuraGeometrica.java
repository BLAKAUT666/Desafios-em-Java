package Exerciceos.figuraGeometrica.dominio;

public class figuraGeometrica {
    protected double altura;
    protected double largura;

    public figuraGeometrica(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public void imprimi(){
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
    }

    // altura
    public void setAltura(double altura){ this.altura = altura; }
    public double getAltura(){ return this.altura; }
    // largura
    public void setLargura(double largura){ this.largura = largura; }
    public double getLargura(){ return this.largura; }
}
