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
public class Client {
    
    public static void main(String[] args){
        Flyweight f = FlyweightFactory.getFlyweight("p");
        System.out.println("key: " + f.getKey());
        System.out.println("HashCode: " + f.hashCode());
        f.setExternalState("Font: italic; Position: 2, 3; Color: blue;");
        System.out.println("HashCode: " + f.hashCode());
        
    }
    
}
