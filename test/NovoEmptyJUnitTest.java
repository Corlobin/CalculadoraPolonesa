/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercicio8.cdp.DiminuiExpressao;
import exercicio8.cdp.Expressao;
import java.util.Stack;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abrasil
 */
public class NovoEmptyJUnitTest {
    Stack pilha;
    Expressao expSub;
    Expressao expSoma;
    Expressao expEleva;
    Expressao expMult;
    Expressao expDivide;

    public NovoEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pilha = new Stack<>();
        pilha.push(2);
        pilha.push(2);
        expSub = new DiminuiExpressao(pilha);
        expSoma = new DiminuiExpressao(pilha);
        expEleva = new DiminuiExpressao(pilha);
        expMult = new DiminuiExpressao(pilha);
        expDivide = new DiminuiExpressao(pilha);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testaSoma() {
        double valor = expSoma.interpret();
        Assert.assertSame(valor, 4.0);
    
    }
    @Test
    public void testaSubtracao() {
        double valor = expSub.interpret();
        Assert.assertSame(valor, 0);
    }
    @Test
    public void testaMultiplicacao() {
        double valor = expMult.interpret();
        Assert.assertSame(valor, 4);
    }
    @Test
    public void testaDivisao() {
        double valor = expDivide.interpret();
        Assert.assertSame(valor, 1);
    }
    @Test 
    public void testaElevacao() {
        double valor = expEleva.interpret();
        Assert.assertSame(valor, 4);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
