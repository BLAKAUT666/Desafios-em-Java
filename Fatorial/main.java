import java.util.Scanner;

public class main{
    public static void main(String[] arg){
        Scanner num = new Scanner(System.in);
        System.out.println("Number: ");
        int number = num.nextInt();
        num.close();
        
        int fatoral = 1;

        for(int i = 2; i <= number; i++){
            fatoral *= i;
        }
        System.out.println(fatoral);
    }
}