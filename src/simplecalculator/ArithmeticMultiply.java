/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

/**
 *
 * @author Tom
 */
public class ArithmeticMultiply implements IArithmetic
{

    /**
     * 
     * @param x: first operator
     * @param y: second operator
     * @return: product of the given input
     */
    @Override
    public double calculate(double x, double y) 
    {
       if (x!=0 && y!=0)
        {
            return x*y;
        }
        
        else
        {
            return 0;
        }
    }
    
}
