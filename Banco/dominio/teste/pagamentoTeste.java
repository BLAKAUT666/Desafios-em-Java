package teste;

import dominio.pagamentoBoleto;
import dominio.pagamentoCartao;
import dominio.pagamentoCartao.cartao;

public class pagamentoTeste {
    public static void main(String[] args) {
        pagamentoCartao cartaoCredito = new pagamentoCartao("02/05/2028", 4320, cartao.DEBITO);
        pagamentoBoleto pagamentoBoleto = new pagamentoBoleto();
        pagamentoBoleto.comprovante();

        System.out.println(cartaoCredito);
        cartaoCredito.comprovante();
        cartaoCredito.calcularValorTotal(1240);

    }
}
