/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberto Borges
 */





public class MetodosBasic {
    int matrizAdj[][];
    
    public MetodosBasic(int matriz[][]) {
        getAdjacencia(matrizAdj);
    }
    
    
    List <Integer> listaAdj = new ArrayList<>();
    
    
     List <Integer> getAdjacencia(int matrizAdj[][]){
         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 10; j++) {
                 if (matrizAdj[i][j] == 1) {
                     listaAdj.add(i);
                     listaAdj.add(j);
                 }
             }
         }
         return listaAdj;
    }
     
     
}
