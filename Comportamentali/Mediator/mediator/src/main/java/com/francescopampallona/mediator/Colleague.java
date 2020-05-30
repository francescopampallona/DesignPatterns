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
public abstract class Colleague {
    private Mediator mediator;
    private static int n;
    private int id;
    
    public Colleague(Mediator m){
        this.mediator = m;
        this.mediator.addColleague(this);
        n++;
        this.id = n;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public int getId() {
        return id;
    }
    
    
    public void sendToAll(String message){
        mediator.sendToAll(message, this);
    }
    
    public void send(String message, Colleague receiver){
        mediator.send(message, receiver);
    }
    
    public abstract void receive(String message);
    
}
