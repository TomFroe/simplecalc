/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplecalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tom
 */
public class TestCalc {
    
    private IArithmetic ari;
    private double x;
    private double y;
    
    public TestCalc() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        x = 12.0;
        y = 3.0;
    }
    
    @After
    public void tearDown() {
    }

   /**
     * Test of addieren method, of class Rechenwerk.
     */
    @Test
    public void testAdd() {
        ari = new ArithmeticAdd();
        System.out.println("addieren");
        double expResult = 15.0;
        double result = ari.calculate(x, y);
        assertTrue(expResult == result);
    }

    /**
     * Test of subtrahieren method, of class Rechenwerk.
     */
    @Test
    public void testSub() {
        ari = new ArithmeticSubtract();
        System.out.println("subtrahieren");
        double expResult = 9.0;
        double result = ari.calculate(x, y);
        assertTrue(expResult == result);
    }

    /**
     * Test of multiplizieren method, of class Rechenwerk.
     */
    @Test
    public void testMult() {
        ari = new ArithmeticMultiply();
        System.out.println("multiplizieren");
        double expResult = 36.0;
        double result = ari.calculate(x, y);
        assertTrue(expResult == result);
    }

    /**
     * Test of dividieren method, of class Rechenwerk.
     */
    @Test
    public void testDiv() {
        ari = new ArithmeticDivide();
        System.out.println("dividieren");
        double expResult = 4.0;
        double result = ari.calculate(x, y);
        assertTrue(expResult == result);
    }
    
     @Test
    public void testMultNeg() {
        x = - 3.0;
        y = 2.0;
        ari = new ArithmeticMultiply();
        System.out.println("multiplizieren");
        double expResult = -6.0;
        double result = ari.calculate(x, y);
        assertTrue(expResult == result);
    }

    /**
     * Test of dividieren method, of class Rechenwerk.
     */
    @Test
    public void testDivNeg() {
        x = - 9.0;
        y = 3.0;
        ari = new ArithmeticDivide();
        System.out.println("dividieren");
        double expResult = -3.0;
        double result = ari.calculate(x, y);
        assertTrue(expResult == result);
    }
    
    @Test
    public void testAddNeg() {
        x = -3.0;
        y = -3.0;
        ari = new ArithmeticAdd();
        System.out.println("addieren");
        double expResult = -6.0;
        double result = ari.calculate(x, y);
        assertTrue(expResult == result);
    }

    /**
     * Test of subtrahieren method, of class Rechenwerk.
     */
    @Test
    public void testSubNeg() {
        x = -3.0;
        y = -3.0;
        ari = new ArithmeticSubtract();
        System.out.println("subtrahieren");
        double expResult = 0.0;
        double result = ari.calculate(x, y);
        assertTrue(expResult == result);
    }

    /**
     * Test of dividieren method, of class Rechenwerk.
     */
    @Test
    public void testDivZero() {
        x = 0.0;
        y = 0.0;
        ari = new ArithmeticDivide();
        System.out.println("dividieren");
        double expResult = 0.0;
        double result = ari.calculate(x, y);
        assertTrue(expResult == result);
    }
    
    @Test
    public void testMulOverflowPos() {
        ari = new ArithmeticMultiply();
        System.out.println("multiplizieren");
        double expResult = Double.MAX_VALUE*2;
        double result = ari.calculate(Double.MAX_VALUE, 2);
        assertTrue(expResult == result);
    }
    
    @Test
    public void testMulOverflowNeg() {
        ari = new ArithmeticMultiply();
        System.out.println("multiplizieren");
        double expResult = Double.MIN_VALUE*2;
        double result = ari.calculate(Double.MIN_VALUE, 2);
        assertTrue(expResult == result);
    }
    
    @Test
    public void testAddOverflowPos() {
        ari = new ArithmeticAdd();
        System.out.println("addieren");
        double expResult = Double.MAX_VALUE+2;
        double result = ari.calculate(Double.MAX_VALUE, 2);
        assertTrue(expResult == result);
    }
    
    @Test
    public void testAddOverflowNeg() {
        ari = new ArithmeticAdd();
        System.out.println("addieren");
        double expResult = Double.MIN_VALUE+2;
        double result = ari.calculate(Double.MIN_VALUE, 2);
        assertTrue(expResult == result);
    }
    
    @Test
    public void testSubOverflowPos() {
        ari = new ArithmeticSubtract();
        System.out.println("subtrahieren");
        double expResult = Double.MAX_VALUE-2;
        double result = ari.calculate(Double.MAX_VALUE, 2);
        assertTrue(expResult == result);
    }
    
    @Test
    public void testSubOverflowNeg() {
        ari = new ArithmeticSubtract();
        System.out.println("subtrahieren");
        double expResult = Double.MIN_VALUE-2;
        double result = ari.calculate(Double.MIN_VALUE, 2);
        assertTrue(expResult == result);
    }
    
    @Test
    public void testDivOverflowPos() {
        ari = new ArithmeticDivide();
        System.out.println("dividieren");
        double expResult = Double.MAX_VALUE/2;
        double result = ari.calculate(Double.MAX_VALUE, 2);
        assertTrue(expResult == result);
    }
    
    @Test
    public void testDivOverflowNeg() {
        ari = new ArithmeticDivide();
        System.out.println("dividieren");
        double expResult = Double.MIN_VALUE/2;
        double result = ari.calculate(Double.MIN_VALUE, 2);
        assertTrue(expResult == result);
    }
    
    
    
}
 
 


