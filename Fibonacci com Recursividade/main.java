import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o termo da sequência de Fibonacci: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0) {
            System.out.println("Digite um número positivo.");
            return;
        }

        int fibAnterior = 0, fibAtual = 1, fibProximo;

        if (n == 0 || n == 1) {
            System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + n);
        } else {
            for (int i = 2; i <= n; i++) {
                fibProximo = fibAnterior + fibAtual;
                fibAnterior = fibAtual;
                fibAtual = fibProximo;
            }
            System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + fibAtual);
        }
    }
}