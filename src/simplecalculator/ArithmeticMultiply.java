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
