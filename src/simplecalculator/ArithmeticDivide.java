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
public class ArithmeticDivide implements IArithmetic
{
    @Override
    public double calculate(double x, double y)
    {
        
        if(y==0)
        {
            return 0; //der Einfachkeit halber
            
        }
        else
        {
            return x/y;
        }
    }
}
