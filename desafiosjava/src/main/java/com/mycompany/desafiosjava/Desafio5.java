/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.desafiosjava;

/**
 *
 * @author ramos
 */
public class Desafio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Hoje está muito calor";
        
        StringBuilder fraseInvertida = new StringBuilder();
        
        for(int i = frase.length() - 1; i >=0; i--){
            fraseInvertida.append(frase.charAt(i)); 
        }
        System.out.println(fraseInvertida);
        
    }
    
}
