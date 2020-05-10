/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.decorator;

/**
 *
 * @author franc
 */
public class ConcreteDecoratorA implements Decorator{
     Component component = null;
    
    ConcreteDecoratorA(Component c){
        this.component = c;
    }
    
    @Override
    public void Operation(){
        System.out.println("__________________________________________________");
        System.out.println("Operations added by ConcreteDecoratorA....");
        this.component.Operation();
        System.out.println("___________________________________________________");
    }
    
}
