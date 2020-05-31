/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 *
 * @author franc
 */
public class ConcreteObserver implements PropertyChangeListener{
    private String observerState;
    private String observerName;
    
    public ConcreteObserver(String name){
        this.observerName = "ConcreteObserver " + name;
    }
   
    
    //Update
    @Override
    public void propertyChange(PropertyChangeEvent pce){
        this.observerState =(String) pce.getNewValue();
        System.out.println( this.observerName + " has observed a new state: " + this.observerState);
    }

    public String getObserverState() {
        return observerState;
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
    
    
}
