/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.flyweight;
import java.util.HashMap;
/**
 *
 * @author franc
 */
public class FlyweightFactory {
 private static HashMap<String, Flyweight> instanceRegister = new HashMap<String, Flyweight>();
 
 public static Flyweight getFlyweight(String key){
     Flyweight f;
     if(instanceRegister.containsKey(key)){
         f = instanceRegister.get(key);
     }
     else{
         f = new ConcreteFlyweight(key);
         instanceRegister.put(key, f);
     }
     
     return f;
     
 }
}
