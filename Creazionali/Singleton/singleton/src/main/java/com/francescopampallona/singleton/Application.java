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
public class Application {
    
    public static void main(String[] args){
    System.out.println("Prova singleton:");
    Singleton.getInstance();
    Singleton.getInstance();
    }
    
}
