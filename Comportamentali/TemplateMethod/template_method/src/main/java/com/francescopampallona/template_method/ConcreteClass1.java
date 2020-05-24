/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.template_method;

/**
 *
 * @author franc
 */
public class ConcreteClass1 extends AbstractClass{
    
    @Override
    public void PrimitiveOperation1(){
        System.out.println("PrimitiveOperation1: VARIANT 1");
    }
    @Override
    public void PrimitiveOperation2(){
        System.out.println("PrimitiveOperation2: VARIANT 1");
    }
    
    @Override
    public void PrimitiveOperation3(){
        System.out.println("PrimitiveOperation3: VARIANT 1");
    }
    
}
