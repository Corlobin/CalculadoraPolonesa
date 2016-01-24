/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8.application;

import exercicio8.cdp.CalculadoraEvaluator;

/**
 *
 * @author Ricardo
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraEvaluator calculadora = new CalculadoraEvaluator();
        String entrada = " 5 1 2 + 4 * + 3 -";
        Double valor = calculadora.evaluate(entrada);
        System.out.println(" Entrada:" + entrada);
        System.out.println(" Saida: " + valor);
    }
    
}
