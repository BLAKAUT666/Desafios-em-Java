package dominio;
import java.util.Date;

public class pagamentoCartao implements Pagamento{
    // tipo de pagamento do Cartao credito ou debito
    public enum cartao{
        CREDITO(1),
        DEBITO(2);

        public int values;

        cartao(int values){
            this.values = values;
        }
    }
    // atributos
    private String validade;
    private int numero;

    // construtor
    public pagamentoCartao(String validade, int numero, cartao cartao){
        this.validade = validade;
        this.numero = numero;

        // verifica os dados
        if(validade == null || numero <= 0){
            System.out.println("Campos invalidos");
            return;
        }
    }


    @Override
    public String toString(){
        return "Cartao{ " + cartao.CREDITO + " } ";
    }

    // metodos abaixo
    @Override
    public String comprovante(){
        // data
        Date date = new Date();
        //comprovante
        System.out.println("\n --- Comprovante ---");
        System.out.println("Data: " + date);
        System.out.println("Validade: " + getValidade());
        System.out.println("Numero: " + getNumero());
        return "";
    }

    @Override
    public double calcularValorTotal(double valor){
        if(valor <= 0){ System.out.println("Valor invalido, tente novamente!" );}
        return valor / 0.05;
    }

    // get da validade, numero
    public String getValidade(){ return this.validade; }
    public int getNumero(){ return this.numero; }
}
