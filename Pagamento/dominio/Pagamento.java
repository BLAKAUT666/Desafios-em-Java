package Pagamento.dominio;

public abstract class Pagamento{
    //atributos
    protected String data;
    protected double valor;

    // construtor
    public Pagamento(double valor, String data){
        this.valor = valor;
        this.data = data;
    }

    // metodos abstratos
    public abstract void registrarPagamento();
    public abstract void autorizarPagamento(String validade, long numero);

}
