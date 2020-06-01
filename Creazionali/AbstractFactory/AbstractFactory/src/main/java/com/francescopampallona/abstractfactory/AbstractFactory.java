/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.abstractfactory;

/**
 *
 * @author franc
 */
public abstract class AbstractFactory {
    
    
    
    public abstract AbstractProductA CreateProductA();
    public abstract AbstractProductB CreateProductB();
    
   public static AbstractFactory getFactory(int n){
        switch (n) {
            case 1:
                return new ConcreteFactory1();
            case 2:
                return new ConcreteFactory2();
            default:
                return null;
        }
  }
    
}
