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
public class ArithmeticExponent implements IArithmetic {
    
    /**
     * 
     * @param x: first operator
     * @param y: second operator
     * @return: potentiate the given input
     */
    @Override
    public double calculate(double x, double y) 
    {
       return Math.pow(x, y);
    }
}
