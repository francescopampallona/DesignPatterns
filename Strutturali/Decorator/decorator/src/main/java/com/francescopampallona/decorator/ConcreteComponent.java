/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.decorator;

/**
 *
 * @author franc
 */
public class ConcreteComponent implements Component {
    @Override
    public void Operation(){
        System.out.println("Basic operation...");
    }
    
}
