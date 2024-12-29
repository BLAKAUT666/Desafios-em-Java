public class main{
    public static void main(String[] args){
        double[][] matriz = {{2.3, 7.3, 3.5, 8.3}, {3.6, 6.4, 8.4, 10.0} , {2.3, 4.5, 7.5, 8.2}};
        
        for(int i = 0; i < matriz.length; i++){
            double somarNotas = 0;
            for(int j = 0; j < matriz[i].length; j++){
                somarNotas += matriz[i][j];
            }
            double mediaAlunos = somarNotas / matriz[0].length;
            
            if(mediaAlunos < 5.0){System.out.println("reprovado");} 
            else {System.out.println("Aprovado");}
            
            System.out.print("media dos alunos: " + mediaAlunos);
        }
    }
}
