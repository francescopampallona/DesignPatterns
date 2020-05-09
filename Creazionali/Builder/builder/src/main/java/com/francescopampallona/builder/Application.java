/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.builder;

/**
 *
 * @author franc
 */
public class Application {
    public static void main(String[] args){
        /*
        Il cliente desidera un prodotto costituito dai componenti C, Z e D e per 
        ottenere ciò crea l'oggetto Director e lo configura in modo in modo da farlo 
        operare con l'oggetto Builder desiderato (in questo caso ConcreteBuilder1)
        */
        Builder b1 = new ConcreteBuilder1();
        Director d = new Director(b1);
        d.creaProdotto();
        Product prodotto = d.getProduct();
        System.out.println(prodotto.getComponenti());
    }
    
}
