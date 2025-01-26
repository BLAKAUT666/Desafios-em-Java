package Funcionario.dominio;

public class Horista extends Funcionario{
    private double IRRF;
    private double INSS;

    public Horista(String nome, double salario, String dataContratacao){
        super(nome, salario, dataContratacao);
    }

    @Override
    public String toString() {
        return "Assalario{ " +
                " Nome: " + this.nome + " , " +
                " Data de Contratação: " + this.dataContratacao + " , " +
                " Salario: " + this.salario +
                " }";
    }

        @Override
    public void calcularSalarioLiquido(){
        if(this.salario <= 2259.20){
            IRRF = 0;
            INSS = 7.5;

            this.salario -= INSS;
            System.out.println("Valor Liquido: " + salario);
        }
        else if(this.salario >= 2259.21 && this.salario <= 2826.65){
            IRRF = 7.5;
            INSS = 9;

            this.salario -= INSS;
            this.salario -= IRRF;
            System.out.println("Valor Liquido: " + salario);
        }
        else if(this.salario >= 2826.66 && this.salario <= 3751.05){
            IRRF = 15;
            INSS = 12;
            this.salario -= INSS;
            this.salario -= IRRF + salario;
            System.out.println("Valor Liquido: " + salario);
        }
        else if(this.salario >= 3751.06 && this.salario <= 4664.68){
            IRRF = 22.5;
            INSS = 14;

            this.salario -= INSS;
            this.salario -= IRRF;
            System.out.println("Valor Liquido: " + salario);
        }
        else{
            IRRF = 27.5;
            INSS = 18;

            this.salario -= INSS;
            this.salario -= IRRF;
            System.out.println("Valor Liquido: " + salario);
        }
    }
}
