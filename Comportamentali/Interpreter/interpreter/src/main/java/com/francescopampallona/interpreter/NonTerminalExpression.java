/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.interpreter;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author franc
 */
public class NonTerminalExpression extends AbstractExpression {
    
    
    
   
    
    @Override
    public void Interpret(Context c){
     int res = 0;   
     int index = 1;
     
     List<Integer> values = c.getValues();
     Iterator iterValues = values.iterator();
        for (String exp : c.getExpressionList()) {
            if(index%2==0)
            {
                switch(exp){
                    case "+":
                        if(index==2) res = (Integer)iterValues.next() + (Integer)iterValues.next();
                        else res = res + (Integer) iterValues.next();
                        break;
                    case "-":
                        if(index==2) res = (Integer)iterValues.next() - (Integer)iterValues.next();
                        else res = res - (Integer) iterValues.next();
                        break;
                    default:
                        System.out.println("Error: operand not recognized!!!");
                        return;
                }
            }
            index++;
        }
     System.out.println("The result is: " + res);
    }
    
    
    
}
