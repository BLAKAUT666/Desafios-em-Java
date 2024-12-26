import java.util.Scanner;

public class main{
    public static void main(String[] args){
        int sum, div, mult, sub;
        Scanner user = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        int nu1 = user.nextInt();
        System.out.println("digite o segundo numero: ");
        int nu2 = user.nextInt();
        boolean isFalse = true;

        while(isFalse == true){
            System.out.println("-----------------------");
            System.out.println("| [ 1 ] somar         |");
            System.out.println("| [ 2 ] subtrair      |");
            System.out.println("| [ 3 ] multiplicação |");
            System.out.println("| [ 4 ] divisão       |");
            System.out.println("| [ 5 ] sair          |");
            System.out.println("-----------------------");

            int opcao = user.nextInt();

            switch(opcao){
                case 1:
                    sum = nu1 + nu2;
                    System.out.println(nu1 + " + " + nu2 + " = " + sum );
                    break;
                case 2:
                    sub = nu1 - nu2;
                    System.out.println(nu1 + " - " + nu2 + " = " + sub );
                    break;
                case 3:
                    mult = nu1 * nu2;
                    System.out.println(nu1 + " x " + nu2 + " = " + mult );
                    break;
                case 4:
                    div = nu1 / nu2;
                    System.out.println(nu1 + " dividido " + nu2 + " = " + div);
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar a calculadora");
                    isFalse = false;
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente mais tarde!");
            }

        }
        user.close();
    }
}
