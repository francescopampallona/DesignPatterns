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
public interface Mediator {
    public void addColleague(Colleague colleague);
    public void sendToAll(String message, Colleague sender);
    public void send(String message, Colleague receiver);
    
}
