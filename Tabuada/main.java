package Tabuada;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Numero: ");
        int num = user.nextInt();
        user.close();

        for(int k = 0; k <= 10; k++){ System.out.println(num + " x " + k + " = " + k * num); }

    }
}
