/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8.cdp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Ricardo
 */
public class CalculadoraEvaluator {
    
    
    public double evaluate(String equacao) {
        Stack<Double> stack = new Stack<>();
        for(String token: equacao.split(" ")) {            
            
            if(token.equals("+")) {
                Expressao exp = new SomaExpressao( stack );
                Double result = exp.interpret();
                if (result != null) { 
                    stack.push( result );                
                }
            }
            else if(token.equals("-")) {
                Expressao exp =  new DiminuiExpressao( stack );
                Double result = exp.interpret();
                if (result != null) { 
                    stack.push( result );                
                }
            }
            else if(token.equals("/")) {
                Expressao exp = new DivideExpressao( stack );
                Double result = exp.interpret();
                if (result != null) { 
                    stack.push( result );                
                }
            }
            else if(token.equals("*")) {
                Expressao exp = new MultipliacaoExpressao( stack );
                Double result = exp.interpret();
                 if (result != null) { 
                    stack.push( result );                
                }
           }
            else if(token.equals("^")) {
                Expressao exp = new ElevaExpressao( stack );
                Double result = exp.interpret();
                 if (result != null) { 
                    stack.push( result );                
                }
           }
            else {
                try {
                    Double numero = new Double(token);
                    stack.push(numero);
                }
                catch(Exception e) {
                    System.out.println("Ops.. operador invalido:: " + token);
                }
            }
        }
        return stack.pop();
    }
   
    
    
}
