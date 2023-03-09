/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.desafiosjava;

import java.util.Arrays;

/**
 *
 * @author ramos
 */
public class Desafio3 {


    public static void main(String[] args) {
        double[] faturamentoDiario = { 100.50, 80.25, 150.75, 200.00, 90.20, 120.50, 75.80 };
      
      
      double faturamentoTotal = 0.0;
      for (double faturamento : faturamentoDiario) {
         faturamentoTotal += faturamento;
      }
      
      
      double faturamentoMedioDiario = faturamentoTotal / faturamentoDiario.length;
      
      
      int diaMaiorFaturamento = 0;
      for (int i = 1; i < faturamentoDiario.length; i++) {
         if (faturamentoDiario[i] > faturamentoDiario[diaMaiorFaturamento]) {
            diaMaiorFaturamento = i;
         }
      }
      
      
      int diaMenorFaturamento = 0;
      for (int i = 1; i < faturamentoDiario.length; i++) {
         if (faturamentoDiario[i] < faturamentoDiario[diaMenorFaturamento]) {
            diaMenorFaturamento = i;
         }
      }
      
      
      System.out.println("Faturamento diário: " + Arrays.toString(faturamentoDiario));
      System.out.printf("Faturamento total: R$%.2f\n", faturamentoTotal);
      System.out.printf("Faturamento médio diário: R$%.2f\n", faturamentoMedioDiario);
      System.out.println("Dia com maior faturamento: Dia " + (diaMaiorFaturamento+1) + " - R$" + faturamentoDiario[diaMaiorFaturamento]);
      System.out.println("Dia com menor faturamento: Dia " + (diaMenorFaturamento+1) + " - R$" + faturamentoDiario[diaMenorFaturamento]);
   }
}
    

