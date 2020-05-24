/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.chainofresponsibility;

/**
 *
 * @author franc
 */
public class Client {
    
    public static void main(String[] args){
        ConcreteHandler1 ch1 = new ConcreteHandler1();
        ConcreteHandler3 ch3 = new ConcreteHandler3();
        ConcreteHandler2 ch2 = new ConcreteHandler2();
        
       //Definizione dinamica della catena di responsabilità
       ch1.setNext(ch3);
       ch3.setNext(ch2);
       
       //Richiesta
       try{
       ch1.HandleRequest(2);
       }catch(Exception e){
           System.out.println(e);
       }
    }
    
}
