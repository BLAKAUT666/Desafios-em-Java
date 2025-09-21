package Execiceos.Basicos;
import java.util.Scanner;
public class AnoPesssoas {
    //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    //mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
    //(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("idade: ");
        int idade = scanner.nextInt();
        System.out.println("mes que naceu: ");
        int m = scanner.nextInt();
        System.out.println("dia que naceu: ");
        int day = scanner.nextInt();

        if(idade < 0 || m < 0 || day < 0){
            System.out.println("não pode ser negativo o ano,mes e dia");
            return;
        } else{

            int ano = 365;
            int diaMes = 30;
            int result = (ano * idade) + (m * diaMes) + day;

            System.out.println("idade: " + idade);
            System.out.println("mes: " + m);
            System.out.println("dia: " + day);
            System.out.println("\n dias da Terra: " + result);

        }
    }
}
