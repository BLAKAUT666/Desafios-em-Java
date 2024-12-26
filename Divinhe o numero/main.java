import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int num, random;

        Scanner scanner = new Scanner(System.in);
        
        Random number = new Random();
        random = number.nextInt(1,11);
        
        boolean isTrue = false;

        while(isTrue == false){        
            System.out.println("Digite um numero: ");
            num = scanner.nextInt();

            if(num < 0){System.out.println("Apenas numero postivos");}
            else if(num > 10){System.out.println("Apenas numero de 1 entre 10");}


            if(num == random){ System.out.println("Parabens voce acertou"); isTrue = true; break;}
            else{ System.out.println("Errou ,Tente novamente");}

        }
        scanner.close();
    }
}