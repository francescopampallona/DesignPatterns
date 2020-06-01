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
public class Client {
    
    public static void main(String[] args){
        Context contesto = new Context("3 + 2 - 1 + 30");
        
        List<AbstractExpression> exp = new ArrayList<>();
        exp.add(new TerminalExpression());
        exp.add(new NonTerminalExpression());
        
        exp.forEach(e->{
            e.Interpret(contesto);
        });
        
        
        
    }
    
}
