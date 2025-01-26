package Funcionario.dominio;

abstract class Funcionario {
    protected String dataContratacao;
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario, String dataContratacao){
        this.nome = nome;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        calcularSalarioLiquido();
    }

    public abstract void calcularSalarioLiquido();


}
