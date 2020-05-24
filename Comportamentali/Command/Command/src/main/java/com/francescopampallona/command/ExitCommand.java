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
public class ExitCommand implements Command {
    
    private Receiver receiver;
    public ExitCommand(Receiver receiver){
        this.receiver = receiver;
    }
    
     @Override
    public void Execute(){
        this.receiver.Exit();
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
    
}
