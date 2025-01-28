package Pagamento.teste;
import Pagamento.dominio.PagamentoCartaoCredito;

public class pagamentoTeste{
    public static void main(String[] args){
        PagamentoCartaoCredito cartaoCredito = new PagamentoCartaoCredito(100.20, "21/02/2025");
        cartaoCredito.autorizarPagamento("02/08/2028", 1430);
    }
}
