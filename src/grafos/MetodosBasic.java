/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author Roberto Borges
 */
public class MetodosBasic {
    ArrayList <String> listaAdj = new ArrayList<>();
    
     public ArrayList<String> getAdjacencia(int matriz[][]){
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
               if (matriz[i][j] == 1) {
                   int cont = 0;
                   System.out.print("Na posição" + i + j + "são adjacentes");
                    listaAdj.add(cont, "1");
                    cont += 1;
                }  
             }
         }        
        return listaAdj;
    }
     
     
}
