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
public class Director {
    
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }
    /*
    Il Director ordina al Builder di creare un nuovo Product e configurarlo con i 
    componenti scelti dal Client(Application)
    */
    public void creaProdotto(){
        this.builder.creaProdotto();
        this.builder.componenti();
    }
    /*
    Il Director restituisce al Client(Application) il Product costruito dal Builder
    */
    public Product getProduct(){
        return this.builder.getProduct();
    }
    
}
