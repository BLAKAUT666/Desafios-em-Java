import java.util.Scanner;

public class main {
  public static void main(String[] args){
    double mr, ar, fe, ca, total;
    int user;
    Scanner scanner = new Scanner(System.in);
    int carrinho = 0;
    //preços
    mr = 15.20;
    ar = 30.23;
    fe = 4.50;

    System.out.println("dinheiro:");
    double dinheiro = scanner.nextDouble();

    // opcao do usuario
    System.out.println("____________________________");
    System.out.println("|   [ 1 ] pegar produto    |");
    System.out.println("|   [ 2 ] pagar            |");
    System.out.println("____________________________");
    user = scanner.nextInt();
      
    while(user == 1){
      System.out.println("[ 1 ] Macarrão");
      System.out.println("[ 2 ] arroz ");
      System.out.println("[ 3 ] Feijão ");
      System.out.println("[ 4 ]  sair ");
      System.out.println("qual item: ");
      byte item = scanner.nextByte();

      if(item == 1 || item == 2 || item == 3){
        total = mr+ar+fe;
        dinheiro -= total;
        System.out.println("total a pagar: "+total+" pagado:"+dinheiro); 
        break;
      } else if(item == 1 && item == 2){
        total = mr+ar;
        System.out.println("total a pagar: "+total);
      } else if(item == 1){
        total = mr;
        System.out.println("total a pagar: "+total);
      } else if(item < 0){ 
          continue; 
      } else if(item == 4 && item <= 0){ System.out.println("sair");}

      if(user == 2) { System.out.println("saiu do mercado"); break; }
    
    }
    scanner.close();
  }
}
