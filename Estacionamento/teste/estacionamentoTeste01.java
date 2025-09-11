package Execiceos.Estacionamento.teste;

import Execiceos.Estacionamento.dominio.Carro;
import Execiceos.Estacionamento.dominio.Estacionamento;

public class estacionamentoTeste01 {
    public static void main(String[] args) {
        // carros
        Carro carro01 = new Carro("Preto", "BRA3E23");
        Carro carro02 = new Carro("Azul escuro", "BRA91F2");
        Carro carro03 = new Carro("Amarelo", "BRA7K41");
        Carro carro04 = new Carro("Vermelho", "BRA83FJ");
        // array com os carros do estacionamento
        Carro[] carros = {carro01, carro02, carro03, carro04};

        // estacionamento
        Estacionamento estacionamento = new Estacionamento(carros);

    }
}
