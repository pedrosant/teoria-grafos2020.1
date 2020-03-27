/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.Scanner;

/**
 *
 * @author Roberto Borges
 */
public class MetodosBasicos {
public void criarMatriz(int matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            matriz[i][j] = 0;
            
        }
    }
}
    
public void imprimirMatriz(int matriz [][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            System.out.print(matriz[i][j] + "|");
        }
        System.out.println();
    }
}   

public void adicionarVertices(int matrizAdj[][]){
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

public void getAdjacencia(int matrizAdj[][], int verticeProcurado){
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

public boolean ehRegular(int matriz[][], int tamanhoMatriz){
    boolean resultado = false;
   int v[] = new int [tamanhoMatriz];   
     
   for (int i = 0; i < matriz.length; i++) {    
       for (int j = 0; j < matriz.length; j++) {
           if (matriz[i][j] == 1) {
              v[i] += 1;        
           }
       }
      
   }
       int verificado = v[0];
       for (int i = 1; i < v.length; i++) {
           if (verificado == v[i]) {
              resultado = true;
           }else{
              resultado = false;
              break;
           }
       }
          
 return resultado;   
}

public boolean ehCompleto(int matriz[][], int tamanhoMatriz){
   boolean result = false;
   boolean result1 = false;
   boolean result2 = false;   
   int aux = 1;
   
   /*Esse primeiro for verifica a região superior direita da matriz*/
        for (int i = 0; i < tamanhoMatriz; i++) {            
            for (int j = aux; j < tamanhoMatriz; j++) {
                if (matriz[i][j] == 1) {
                    result1 = true;
                }else{
                    result1 = false;
                    break;
                }                
            }
            if (result1 == false) {
                break;
            }
            aux ++;
    }
     
   /*Esse primeiro for verifica a região inferior esquerda da matriz*/
        int j = 1;
        for (int i = 1; i < tamanhoMatriz; i++) {
            int aux2 = 0;
            while(aux2 < j){
                if (matriz[i][aux2] == 1) {
                    result2 = true;
                }else{
                    result2 = false;
                    break;
                }
                if (aux2 < j) {
                    aux2++;
                }
                
            }
            
            if (j < tamanhoMatriz) {
                j++;
            }
            if (result2 == false) {
                break;
            }        
    }
        
        if ((result1 && result2) == true) {
            result = true;
    }
   
   return result;
}

}
