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
public class ConcreteHandler2 extends Handler {
    
    @Override
    public void HandleRequest(int n) throws RequestNotHandledException{
        if(n==2){
         System.out.println("Richiesta esaudita dall'handler " + n);
        }
        else{
            if(next == null){throw new RequestNotHandledException();}
            next.HandleRequest(n);
        }
    }
    
}
