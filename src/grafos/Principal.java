package grafos;

import java.util.Scanner;
/**
 *
 * @author Roberto Borges
 */
public class Principal {
   
public static void criarMatriz(int matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            matriz[i][j] = 0;
            
        }
    }
}
    
public static void imprimirMatriz(int matriz [][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            System.out.print(matriz[i][j] + "|");
        }
        System.out.println();
    }
}   

public static void adicionarVertices(int matrizAdj[][]){
    Scanner scan = new Scanner(System.in);
    String escolha;    
        do {
            System.out.println("Digite o primeiro vertice adjacente");
            int v1 = scan.nextInt();
            System.out.println("Digite o segundo vertice adjacente");
            int v2 = scan.nextInt();
                matrizAdj[v1][v2] = 1;
                matrizAdj[v2][v1] = 1;
                System.out.println("Agrescetar outra adjaceencia (s/n) ?");
                escolha = scan.next();
        }while(escolha.equals("s"));
}

public static void getAdjacencia(int matrizAdj[][], int verticeProcurado){
   for (int i = 0; i < matrizAdj.length; i++) {    
      if (matrizAdj[i][verticeProcurado] == 1) {
          System.out.println("A linha: " + i + " coluna: " + verticeProcurado + " é ajavente vertice v" + verticeProcurado);
      }      
   }
   for (int i = 0; i < matrizAdj.length; i++) {    
      if (matrizAdj[verticeProcurado][i] == 1) {
          System.out.println("A linha: " + verticeProcurado + " coluna: " + i + " é ajavente vertice v" + verticeProcurado);
      }      
   }
}

public static boolean ehRegular(int matriz[][], int tamanhoMatriz){
    boolean resultado = false;
    int contador = 0;
    int v[] = new int [tamanhoMatriz];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (matriz[j][i] == 1) {
               contador++;
               v[i] = contador;
            }          
        }
        
    }
    for (int i = 0; i < v.length; i++) {
        if (v[0] == v[i+1]) {
             resultado = true;   
        }else{
             resultado = false;
             continue;
        }
           
    }
    return resultado;
}

public static void ehCompleto(){
    
}


public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Digite o número de vertices de seu grafo: ");
int n = scan.nextInt();
int matrizAdj[][] = new int [n][n];   
    criarMatriz(matrizAdj);
    imprimirMatriz(matrizAdj);
    System.out.println("Adicionar adjacências (s/n)");
    String escolha = scan.next();
    if (escolha.equals("s")) {
        adicionarVertices(matrizAdj);
    }
    System.out.println("********MATRIZ DE ADJACÊNCIA*********");
    imprimirMatriz(matrizAdj);
    
    System.out.println("Procurar adijacente ? (s/n)");
    escolha = scan.next();
    if (escolha.equals("s")) {
        System.out.println("Qual vertice você que saber os adjacentes ?");
        int vertice = scan.nextInt();
        getAdjacencia(matrizAdj, vertice);
    }
  }    
    
   
}

