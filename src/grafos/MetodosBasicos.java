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

public boolean ehConexo (int matriz[][], int tamanhoMatriz){
    boolean result = false;
    boolean resultFinal = false;
    int v[] = new int[tamanhoMatriz];
    boolean v2[] = new boolean[tamanhoMatriz];
        for (int i = 0; i < tamanhoMatriz; i++) {
            
            //Zerar vetor v;
            for (int j = 0; j < tamanhoMatriz; j++) {
                v[j] = 0;
            }
            
            // verifica se a componetes conxo e atribui vlor 1 para o vertor v
            for (int j = 0; j < tamanhoMatriz; j++) {
                if (i == j) {
                    v[j] = 0;
                    continue;
                }else if(matriz[i][j] == 0) {
                    v[j] = 0;
                }else{
                    v[j] = 1;
                }
            }
            
            // verifica o vetor v e todo 0, se for, atribue falso ao vetor v2
            for (int j = 0; j < tamanhoMatriz; j++) {
                if (j != i) {
                    if (v[j] == 1) {
                        result = true;
                        v2[i] = result;
                        break;
                    }else{
                        result = false;
                        v2[i] = result;
                }
            }           
        }   
     }
        // verifica se há false no vertor v2 se houver o método retorna false
        for (int i = 0; i < tamanhoMatriz; i++) {
            if (v2[i] == false) {
                resultFinal = false;
                break;
            }else{
                resultFinal = true;
            }
    }
return resultFinal;
}

public int dijkstra1(int matriz [][], int taamanhoMattriz){
    int m[][] = new int [4][taamanhoMattriz];
    for (int i = 0; i < 10; i++) {
        
    }
    return 0;
}

public int dijkstra2(){
    return 0;
}




}
