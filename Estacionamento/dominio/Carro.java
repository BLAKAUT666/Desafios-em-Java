package Execiceos.Estacionamento.dominio;

public class Carro {
    public final int VELOCIDADE_MAXIMA = 25;
    public String cor, placa;

    public Carro(String cor, String placa){
        this.cor = cor;
        this.placa = placa;

    }

    public String getCor(){
        return this.cor;
    }
    public String getPlaca(){
        return this.placa;
    }
}
