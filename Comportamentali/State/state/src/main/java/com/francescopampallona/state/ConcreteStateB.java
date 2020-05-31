/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.state;

/**
 *
 * @author franc
 */
public class ConcreteStateB implements State {
    private final String state = "ConcreteStateB";
    @Override
    public void showState(){
        System.out.println(this.state);
    }
}
