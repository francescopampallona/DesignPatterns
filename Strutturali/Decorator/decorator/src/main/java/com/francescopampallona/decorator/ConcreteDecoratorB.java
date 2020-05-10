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
public class ConcreteDecoratorB implements Decorator {
    Component component = null;
    
    ConcreteDecoratorB(Component c){
        this.component = c;
    }
    
    @Override
    public void Operation(){
        System.out.println("__________________________________________________");
        System.out.println("Operations added by ConcreteDecoratorB....");
        this.component.Operation();
        System.out.println("___________________________________________________");
    }
}
