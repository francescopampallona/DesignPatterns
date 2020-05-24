/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.chainofresponsibility;

/**
 *
 * @author franc
 */
public abstract class Handler {
    Handler next = null;
    
    public void setNext(Handler next){
        this.next = next;
    
    }
    
    public abstract void HandleRequest(int n) throws RequestNotHandledException;
    
}
