/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.flyweight;

/**
 *
 * @author franc
 */
public class ConcreteFlyweight implements Flyweight{
    
    private String key = null;
    
    public ConcreteFlyweight(String internalState){
    this.key = internalState;
    }
    
   @Override
    public void setExternalState(String externalState){
        System.out.println("External state: " + externalState);
    }
    
    @Override
    public String getKey(){
        return this.key;
    }
    
    
    
    
    
}
