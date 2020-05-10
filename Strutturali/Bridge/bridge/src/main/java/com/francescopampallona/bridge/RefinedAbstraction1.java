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
public class RefinedAbstraction1 extends Abstraction{
     RefinedAbstraction1(Implementor implementor){
        super(implementor);
    }
    
    
    public void refOp(){
        System.out.println("refOp running...");
        operation();
    }
}
