package dominio;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    // recebe o numero da conta e o saldo
    public ContaBancaria(String numero, double saldo){
        this.numeroConta = numero;
        this.saldo = saldo;
    }

    // metodo imprimi dados da conta bancaria
    public void imprimi(){
        System.out.println("numero: " + this.numeroConta);
        System.out.println("saldo: " + this.saldo);
    }

    // numero da conta
    public void setNumeroConta(String numeroConta){ this.numeroConta = numeroConta; }
    public String getNumeroConta(){ return this.numeroConta; }

    // saldo
    public void setSaldo(double saldo){ this.saldo = saldo; }
    public double getSaldo(){ return this.saldo; }

    // metodo sacar
    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("valor invalido, tente novamento mais tarde!");
            return;
        }
        if(valor > saldo){
            System.out.println("valor invalido, tente novamente mais terde!");
            return;
        }

        this.saldo -= valor;
        System.out.println("saldo a sacar: " + valor);
        System.out.println("total de saldo: " + getSaldo());
    }

    // metodo depósitar
    public void depositar(double depositar){
        System.out.println("valor depositado: " + depositar);

        saldo += depositar;
        System.out.println("total do saldo: " + saldo);
    }
}
