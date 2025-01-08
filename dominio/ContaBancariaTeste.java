package dominio;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria("350600", 1250.53);
        banco.imprimi();

        // depositar dinheiro
        banco.depositar(1000);
        // sacar dinheiro
        banco.sacar(2800);
    }
}
