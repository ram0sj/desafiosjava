

package com.mycompany.desafiosjava;
import java.util.Scanner;
/**
 *
 * @author ramos
 */
public class Desafio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 20;
        int[] fibonacci =  new int[contador];
        
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i = 2; i < contador; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        
        for (int i = 0; i < contador; i++){
            System.out.println(fibonacci[i]);
        }
             
    }
    
}
