import java.util.Scanner;

public class main{
    public static void main(String[] args){
        //criando a variavel que armazena o resultado
        int result;

        Scanner user = new Scanner(System.in);
        // Perguntando ao usuario o numero
        System.out.println("numero: ");
        // armazenando o valor que o usuario digitol
        int num = user.nextInt();
        //fechando o Scanner
        user.close();

        result = 0;
        //fazendoo a logica em um loop for
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                result += 1;
            }
        }

        if (result == num) {
            System.out.println(num + " é número perfeito.");
        } else {
            System.out.println(num + " é um número imperfeito.");
        }
    }
}