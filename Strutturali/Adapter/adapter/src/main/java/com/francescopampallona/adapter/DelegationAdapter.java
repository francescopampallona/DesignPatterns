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
public class DelegationAdapter implements Target{
    private  Adaptee adaptee;
    
    DelegationAdapter(Adaptee a){
        this.adaptee = a;
    }
    @Override
    public void Request(){
        this.adaptee.SpecificRequest();
    }
    
}
