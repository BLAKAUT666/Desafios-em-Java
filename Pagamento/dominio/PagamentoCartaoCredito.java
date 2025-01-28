package Pagamento.dominio;
import java.util.Scanner;

public class PagamentoCartaoCredito extends Pagamento{
    public PagamentoCartaoCredito(double valor, String data){
        super(valor, data);
    }

    @Override
    public String toString(){
        return "Credito{ " +
                " Valor: " + this.valor + " , "+
                " Data: " + this.data +
                " }";
    }


    @Override
    public void autorizarPagamento(String validade, long numero){
        if(valor <= 0){
            System.out.println("saldo invalido, operação cancelada! ");
            return;
        }
        else if(data == null){
            System.out.println("Data incorreta, tente novamente mais tarde! ");
            return;
        }
        else if(validade == null || numero <= 0){
            System.out.println("Campos invalidos, tente novamento mais tarde! ");
            return;
        }
        else{
            System.out.println(" \n---Informaçoes do seu cartao---");
            System.out.println("Valor: " + this.valor);
            System.out.println("Data: " + this.data);
            System.out.println("Validade: " + validade);
            System.out.println("Numero: " + numero);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite 1-sim ou 2-nao, para comprar: ");
            int user = scanner.nextInt();
            scanner.close();

            if(user == 1){
                System.out.println("Compra Aprovada");
                registrarPagamento();
                return;
            }
            else{
                System.out.println("Compra negada");
                return;
            }
        }
    }

    @Override
    public void registrarPagamento(){
        System.out.println("Pagamento Registrado");
        System.out.println("Data: " + this.data);
        System.out.println("Valor: " + this.valor);
    }
}
