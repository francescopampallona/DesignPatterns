/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.interpreter;


import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class TerminalExpression extends AbstractExpression {
    
    private List<Integer> values;
    
    public TerminalExpression(){
        values = new ArrayList<>();
    }
    
    @Override
    public void Interpret(Context c){
        int index = 1;
        for (String exp : c.getExpressionList()) {
            if(index%2!=0)
            {
                values.add(Integer.parseInt(exp));
            }
            index++;
        }
        
        c.setValues(values);
        
        
    }

    
    
    
}
