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
public class ArithmeticAdd implements IArithmetic
{

    @Override
    public double calculate(double x, double y) 
    {
        return x+y;
    }
    
}
