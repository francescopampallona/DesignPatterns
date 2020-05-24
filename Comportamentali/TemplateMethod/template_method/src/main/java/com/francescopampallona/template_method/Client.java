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
public class Client {
    
    public static void main(String[] args){
        AbstractClass c1 = new ConcreteClass1();
        AbstractClass c2 = new ConcreteClass2();
        c1.TemplateMethod(true);
        System.out.println("_____________________________________");
        c1.TemplateMethod(false);
        System.out.println("_____________________________________");
        c2.TemplateMethod(false);
        
        
        
    }
}
