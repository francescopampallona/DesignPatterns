/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.singleton;

/**
 *
 * @author franc
 */
public class Singleton {
    
    private static Singleton m_instance = null;
    
    private Singleton(){
        System.out.println("Singleton instanziata! hashcode: " + hashCode() );
    }
    
    public static Singleton getInstance(){
     if(m_instance==null){
         m_instance = new Singleton();
     }
     return m_instance;
    }
    
    
    
}
