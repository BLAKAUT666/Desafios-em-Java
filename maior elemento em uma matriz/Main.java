public class Main {
    public static void main(String[] args){
        int[][] array = {{3, 5, 6}, {4, 1, 9}};
        
        int maior = array[0][0];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > maior){
                    maior = array[i][j];
                }
            }
        }

        System.out.println("numero maior: " + maior);
    }
}
