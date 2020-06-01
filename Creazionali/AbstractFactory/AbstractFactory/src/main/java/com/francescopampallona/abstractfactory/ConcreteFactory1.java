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
public class ConcreteFactory1 extends AbstractFactory {
    
    @Override
    public AbstractProductA CreateProductA(){
       return new ProductA1();
    }
    
    @Override
    public AbstractProductB CreateProductB(){
        return new ProductB1();
    }
    
}
