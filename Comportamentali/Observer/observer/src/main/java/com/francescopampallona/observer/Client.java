/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.observer;

import java.beans.PropertyChangeListener;


/**
 *
 * @author franc
 */
public class Client {
    
    public static void main(String[] args) {
        ConcreteSubject observable = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver("observer");
        ConcreteObserver observer1 = new ConcreteObserver("observer1");
        ConcreteObserver2 observer2 = new ConcreteObserver2("obs2");
        
        observable.Attach(observer);
        observable.Attach(observer1);
        observable.Attach(observer2);
        
        observable.setSubjectState("stateX");
    }
}
