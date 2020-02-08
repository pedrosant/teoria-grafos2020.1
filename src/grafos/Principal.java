package grafos;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Roberto Borges
 */
    public class Principal {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de vertices de seu grafo: ");
        int n = scan.nextInt();
        int matrizAdj[][] = new int [n][n];
        MetodosBasic metodosBasisc;
        for (int i = 0; i < matrizAdj.length; i++) {
            for (int j = 0; j < matrizAdj.length; j++) {
                System.out.print(matrizAdj[i][j]+ " | ");
            }
            System.out.println("");
        }
        
        System.out.println("Adicionar adjacências (s/n)");
        String escolha = scan.next();
        do {
            
            if (escolha.equals("s")) {
                System.out.println("Digite o primeiro vertice adjacente");
            int v1 = scan.nextInt();
                System.out.println("Digite o segundo vertice adjacente");
            int v2 = scan.nextInt();
                matrizAdj[v1][v2] = 1;
                matrizAdj[v2][v1] = 1;
                System.out.println("Agrescetar outra adjaceencia (s/n) ?");
                escolha = scan.next();
        }}while(escolha.equals("s"));        
        System.out.println("********MATRIZ DE ADJACÊNCIA*********");
        for (int i = 0; i < matrizAdj.length; i++) {
            for (int j = 0; j < matrizAdj.length; j++) {
                System.out.print(matrizAdj[i][j]+ " | ");
            }
            System.out.println("");
        }
    }
    
    ArrayList<String> listaAdj = new ArrayList<>();
    
}
