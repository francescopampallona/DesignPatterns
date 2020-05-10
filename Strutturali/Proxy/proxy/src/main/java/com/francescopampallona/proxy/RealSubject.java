/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.proxy;

/**
 *
 * @author franc
 */
public class RealSubject implements Subject {
    
    @Override
    public void Request(){
        System.out.println("Personal information...");
    }
}
