/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.bridge;

/**
 *
 * @author franc
 */
public class RefinedAbstraction extends Abstraction {
    RefinedAbstraction(Implementor implementor){
        super(implementor);
    }
    
    
    public void refined_operation(){
        System.out.println("Refined operation...");
        operation();
    }
}
