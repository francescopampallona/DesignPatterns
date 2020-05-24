/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.command;

/**
 *
 * @author franc
 */
public class ConcreteCommand1 implements Command {
    private Receiver receiver;
    
    public ConcreteCommand1(Receiver receiver){
        this.receiver = receiver;
    }
    
    @Override
    public void Execute(){
        this.receiver.Action1();
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
    
    
    
}
