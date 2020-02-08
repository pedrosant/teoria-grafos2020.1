package grafos;

import java.util.Scanner;

/**
 *
 * @author Roberto Borges
 */
    public class Grafos {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de vertices de seu grafo: ");
        int n = scan.nextInt();
        int matrizAdj[][] = new int [n][n];
        
        for (int i = 0; i < matrizAdj.length; i++) {
            for (int j = 0; j < matrizAdj.length; j++) {
                System.out.print(matrizAdj[i][j]+ " | ");
            }
            System.out.println("");
        }
        
       
    }
    
}
