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
public abstract class AbstractClass {
    
    public void TemplateMethod(boolean n){
        System.out.println("Parte invariante dell'algoritmo....");
        if(n){  PrimitiveOperation1();}
        else {PrimitiveOperation2();}
        System.out.println("Parte invariante dell'algoritmo....");
        PrimitiveOperation3();
        
    }
    
    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();
    public abstract void PrimitiveOperation3();
}
