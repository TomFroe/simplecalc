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

import java.util.Scanner;

public class Display implements IDisplay
{
    private IArithmetic calc;
    private double result, x, y;
    
    
    /**
     *
     * @param calc
     */
    public Display(IArithmetic calc)
    {
        this.calc=calc;
    }
   
       
    @Override
    public void show()
    {
        String symbol;

        Scanner scan = new Scanner(System.in);
        boolean finished = false;
        while (!finished)
        {
            try
            {
                System.out.println("Bitte geben Sie die erste Zahl ein");
                x = scan.nextDouble();
            
                System.out.println("Bitte geben Sie das Rechensymbol ein (+, -, *, /, ^, wurzel)");
                symbol = scan.next();
            
                System.out.println("Bitte geben Sie die zweite Zahl ein");
                y = scan.nextDouble();
                
                result = selectArithmetic(symbol).calculate(x, y);
                System.out.println("Ergebnis: " + Math.round(result*100)/100.0);
            }
            
            catch (Exception e)
            {
                System.out.println("Fehlererhafte Eingabe, versuchen Sie es noch einmal");
            }
            
            finally
            {
                System.out.println("Möchten Sie beenden (ja/nein)");
                if (scan.next().toLowerCase().equals("ja"))
                {
                    finished = true;
                    System.out.println("Vergangene Werte:");
                    System.out.println("Auf Wiedersehen");
                }
            }
        }
    }
   /**  
    *@param s: suitable Operator
    *@return: new concrete Arithmetic Objekt
    */
    private IArithmetic selectArithmetic(String s)
    {
        switch(s)
        {
            case "+":
            return new ArithmeticAdd();
            
            case "-":
            return new ArithmeticSubtract();
            
            case "*":
            return new ArithmeticMultiply();
            
            case "/":
            return new ArithmeticDivide();
                
            case "^":
            return new ArithmeticExponent();
                
            case "wurzel":
            return new ArithmeticRoot();
                
            default:
            break;
        }     
        return null; 
    }
}