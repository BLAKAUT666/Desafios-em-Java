import java.util.Scanner;
import java.lang.*;

public class main{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um frase: ");
        String frase = n.nextLine();
        int vogais = 0;
        String vogasList = "aeiouAEIOU";

        for(int i = 0; i <= frase.length(); i++){
            char caracter = frase.charAt(i);
            if(vogasList.contains(String.valueOf(caracter))){
                vogais++;
            }
        }
        System.out.println("a frase: " + frase + " total de vogais: " + vogais);
    }
}
