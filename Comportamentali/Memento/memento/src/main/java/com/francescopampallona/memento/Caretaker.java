/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.memento;


import java.util.Stack;


/**
 *
 * @author franc
 */
public class Caretaker {
    
    private static Stack<Memento> mementoStack = new Stack<Memento>();
    
    public static void main(String[] args){
        
        Originator o = new Originator();
        o.setState("StateA");
        mementoStack.add(o.CreateMemento());
        o.setState("StateB");
        mementoStack.add(o.CreateMemento());
        o.setState("StateC");
        mementoStack.add(o.CreateMemento());
        //RESTORE THE PREVIOUS STATE
        System.out.println("-------------RESTORE PREVIOUS STATE-------------");
        mementoStack.pop();
        o.SetMemento(mementoStack.pop());
    }
}
