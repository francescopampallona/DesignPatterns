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
public class RequestNotHandledException extends Exception{
    
    public RequestNotHandledException(){
        super("Your request cannot be handled!!!");
    }
    
    @Override
    public String toString(){
     return this.getMessage();
    }
    
}
