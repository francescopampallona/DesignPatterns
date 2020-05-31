/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.observer;


/**
 *
 * @author franc
 */
public class ConcreteSubject extends Subject{
    private String subjectState;
    
    

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        Notify(subjectState);
        this.subjectState = subjectState;
    }
    
    @Override
    public void Notify(String newState){
        this.getSupport().firePropertyChange("state", this.subjectState, newState);
    }
}
