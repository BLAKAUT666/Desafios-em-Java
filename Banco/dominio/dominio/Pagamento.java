package dominio;

public interface Pagamento{
    String comprovante();
    double calcularValorTotal(double valor);
}
