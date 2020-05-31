/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.observer;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
/**
 *
 * @author franc
 */
public abstract class Subject {
    private PropertyChangeSupport support;
    
    public Subject(){
        this.support = new PropertyChangeSupport(this);
    }
    
    public void Attach(PropertyChangeListener observer){
     support.addPropertyChangeListener(observer);
    }
    
    public void Detach(PropertyChangeListener observer){
        support.removePropertyChangeListener(observer);
    }
    
    public abstract void Notify(String newState);

    public PropertyChangeSupport getSupport() {
        return support;
    }
    
    
}
