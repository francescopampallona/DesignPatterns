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


public class Adapter extends Adaptee implements Target  {
    
    @Override
    public void Request(){
        SpecificRequest();
    }
    
}
