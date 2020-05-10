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
        Component fogliaB = new Leaf1("b");
        Component fogliaA2 = new Leaf2("a2");
        Component oggetto_composto = new Composite("composto");
        oggetto_composto.add(fogliaA);
        oggetto_composto.add(fogliaA2);
        oggetto_composto.showComponents();
    }
}
