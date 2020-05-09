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
public class ConcreteBuilder2 extends Builder {
    
     @Override
   public void componenti(){
       product.setComponenti("componenteA componenteF");
   }
    
}
