/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.composite;

/**
 *
 * @author franc
 */
public class Client {
    public static void main(String[] args){
        
        Component fogliaA = new Leaf1("a");
        Component fogliaA2 = new Leaf2("a2");
        //Composto
        Component oggetto_composto = new Composite("composto");
       
        oggetto_composto.add(fogliaA2);
        //Composto2 
        Component oggetto_composto2 = new Composite("composto2");
        oggetto_composto2.add(fogliaA);
        oggetto_composto2.add(oggetto_composto);
        //SHOW COMPONENTS
        oggetto_composto2.showComponents();
        System.out.println("__________________________________________________");
        oggetto_composto.showComponents();
        
    }
}
