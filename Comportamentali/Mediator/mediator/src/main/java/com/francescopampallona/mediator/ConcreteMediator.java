/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */
public class ConcreteMediator implements Mediator{
    
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    
    @Override
    public void addColleague(Colleague colleague){
        colleagues.add(colleague);
    }
    
    @Override
    public void sendToAll(String message, Colleague sender){
        this.colleagues.forEach(element ->{
         
        if(element.getId() != sender.getId()){
            element.receive(message);
        }
        });
    }
    
    @Override
    public void send(String message, Colleague receiver){
        this.colleagues.forEach(element->{
            if(element.getId() == receiver.getId()){
                element.receive(message);
            }
        });
        
    }
}
