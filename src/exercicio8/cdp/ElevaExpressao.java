/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8.cdp;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author Ricardo
 */
public class ElevaExpressao implements Expressao {
    private Stack<Double> stack;

    public ElevaExpressao(Stack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public Double interpret() {
        Double result = null;
        if( stack.size() > 1) {
            Double n1 = stack.pop();
            Double n2 = stack.pop();
            result = Math.pow(Math.round(n1), Math.round(n2));
        }
        return result;
    }
    
    
}
