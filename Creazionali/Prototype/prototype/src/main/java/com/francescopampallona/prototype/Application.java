/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.prototype;

/**
 *
 * @author franc
 */
public class Application {
    public static void main(String[] args){
    Creator c = new Creator();
    try{
    ConcreteObject1 co1= (ConcreteObject1)c.createObject("com.francescopampallona.prototype.ConcreteObject1");
    
    ConcreteObject2 co2= (ConcreteObject2)c.createObject("com.francescopampallona.prototype.ConcreteObject2");
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
