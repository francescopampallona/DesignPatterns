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
public abstract class Abstraction {
    
    private final Implementor implementor;
    
    Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    
    public  void operation(){
        this.implementor.opImp();
    }
    
}
