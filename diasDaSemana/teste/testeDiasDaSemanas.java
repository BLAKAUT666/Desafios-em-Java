package enumeracao.Execiceos.diasDaSemana.teste;
import enumeracao.Execiceos.diasDaSemana.dominio.Semanas;
import enumeracao.Execiceos.diasDaSemana.dominio.diasDaSemana;

public class testeDiasDaSemanas {
    public static void main(String[] args) {
        Semanas semanas = new Semanas(diasDaSemana.DOMINGO);
        semanas.diaDaSemana("Segunda-Feira");
        System.out.println(semanas.getDiasDaSemana());
    }
}
