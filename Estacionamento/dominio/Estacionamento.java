package Execiceos.Estacionamento.dominio;

public class Estacionamento {
    private Carro[] carro;
    private int v = 0;

    public Estacionamento(Carro[] carro){
        this.carro = carro;

        for(Carro i: carro){
            v++;
            System.out.println("________________________");
            System.out.println("    ESTACIONAMENTO     ");
            System.out.println("  Numero: " + v);
            System.out.println("  Cor: " + i.getCor());
            System.out.println("  Placa: " + i.getPlaca());
            System.out.println("  Velocidade Maxima: " + i.VELOCIDADE_MAXIMA);
            System.out.println("________________________");
        }
    }
}
