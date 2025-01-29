package dominio;
import java.util.Date;

public class pagamentoBoleto implements Pagamento{
    // metodos feitos
    @Override
    public String comprovante(){
        Date date = new Date();
        System.out.println("--- comprovante ---");
        System.out.println("data de vencimento: " + date);
        return "";
    }

    @Override
    public double calcularValorTotal(double valor){
        return valor;
    }
}
