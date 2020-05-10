/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.adapter;

/**
 *
 * @author franc
 */
public class Application {
    
    public static void main(String[] args){
        System.out.println("Prima soluzione: basata sull'ereditarietà");
        Adapter adapter = new Adapter();
        adapter.Request();
        System.out.println("_____________________________________________________");
        System.out.println("SECONDA SOLUZIONE: basata sulla delega");
        Adaptee adaptee = new Adaptee();
        DelegationAdapter delegation_adapter = new DelegationAdapter(adaptee);
        delegation_adapter.Request();
        
    }
    
}
