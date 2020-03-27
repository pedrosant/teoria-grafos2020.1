package grafos;

import java.util.Scanner;
/**
 *
 * @author Roberto Borges
 */
public class Principal {
   


public static void main(String[] args) {
    
MetodosBasicos met = new MetodosBasicos();
    
    
Scanner scan = new Scanner(System.in);
System.out.println("Digite o número de vertices de seu grafo: ");
int n = scan.nextInt();
int matrizAdj[][] = new int [n][n];   
    met.criarMatriz(matrizAdj);
    met.imprimirMatriz(matrizAdj);
    System.out.println("Adicionar adjacências (s/n)");
    String escolha = scan.next();
    if (escolha.equals("s")) {
        met.adicionarVertices(matrizAdj);
    }
    System.out.println("********MATRIZ DE ADJACÊNCIA*********");
    met.imprimirMatriz(matrizAdj);
    
    System.out.println("Procurar adijacente ? (s/n)");
    escolha = scan.next();
    if (escolha.equals("s")) {
        System.out.println("Qual vertice você que saber os adjacentes ?");
        int vertice = scan.nextInt();
        met.getAdjacencia(matrizAdj, vertice);
    }
    
    System.out.println("Verificar se é k-Regular ? (s/n)");
    boolean resultado;
    escolha = scan.next();
    if (escolha.equals("s")) {
        resultado = met.ehRegular(matrizAdj, n);
        System.out.println(resultado);
    }
   
    System.out.println("Verificar se é ehCompleto ? (s/n)");
    escolha = scan.next();
    if (escolha.equals("s")){
        resultado = met.ehCompleto(matrizAdj ,n);
        System.out.println(resultado);
    }
    
    
    System.out.println("Verificar se é ehConexo ? (s/n)");
    escolha = scan.next();
    if (escolha.equals("s")){
        resultado = met.ehConexo(matrizAdj ,n);
        System.out.println(resultado);
    }
    
  }    
    
   
}

