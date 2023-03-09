/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.desafiosjava;

import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author ramos
 */
public class Desafio4 {

    public static void main(String[] args) {
        double spFaturamento = 67836.43;
        double rjFaturamento = 36678.66;
        double mgFaturamento = 29229.88;
        double esFaturamento = 27165.48;
        double outrosFaturamento = 19849.53;
        
        
        double faturamentoTotal = spFaturamento + rjFaturamento + mgFaturamento + esFaturamento + outrosFaturamento;
        
        
        NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        
       
        System.out.println("Faturamento mensal da distribuidora, detalhado por estado:");
        System.out.println("SP - " + realFormat.format(spFaturamento));
        System.out.println("RJ - " + realFormat.format(rjFaturamento));
        System.out.println("MG - " + realFormat.format(mgFaturamento));
        System.out.println("ES - " + realFormat.format(esFaturamento));
        System.out.println("Outros - " + realFormat.format(outrosFaturamento));
        System.out.println("Faturamento total: " + realFormat.format(faturamentoTotal));
    }
    
}
