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
public class SimpleCalculator 
{

    private IDisplay gui;
    private IArithmetic rechner;
    
    public SimpleCalculator()
    {
        gui = new Display(rechner);
        gui.show();
    }
    
    public static void main(String[] args) 
    {
        SimpleCalculator calc = new SimpleCalculator();
    }
    
}
