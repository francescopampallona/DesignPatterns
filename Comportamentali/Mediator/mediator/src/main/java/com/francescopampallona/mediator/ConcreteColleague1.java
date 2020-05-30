/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.mediator;

/**
 *
 * @author franc
 */
public class ConcreteColleague1 extends Colleague{
    
    public ConcreteColleague1(Mediator m){
        super(m);
        
    }
    @Override
    public void receive(String message){
        System.out.println("CC1 with id=" + this.getId() + " has received: " + message);
    }
    
}
