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
public abstract class Builder {
    protected Product product;

    public Product getProduct() {
        return product;
    }
    
  
    public void creaProdotto(){
        product= new Product();
    }
    
    public abstract void componenti();
    
}
