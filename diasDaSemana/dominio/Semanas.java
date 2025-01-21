package enumeracao.Execiceos.diasDaSemana.dominio;

import com.sun.tools.jconsole.JConsoleContext;

public class Semanas {
    private diasDaSemana diasDaSemana;

    public Semanas(diasDaSemana dia) {
        this.diasDaSemana = dia;
    }

    //sobrecarrendo o metodo toString()
    public String toString(){
        return "Dia da semana: { dia: " + this.diasDaSemana.getDia() +  " }";
    }

    //metodo percorre os dias da semana
    public diasDaSemana diaDaSemana(String dia){
        for(diasDaSemana dia1: diasDaSemana.values()){
            if(dia1.equals(diaDaSemana(dia))){
                return dia1;
            }
        }

        for(int i = 0; i < dia.length(); i++){
            System.out.println(i);
        }

        return null;
    }

    public diasDaSemana getDiasDaSemana() {
        return diasDaSemana;
    }

    public void setDiasDaSemana(diasDaSemana diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }
}
