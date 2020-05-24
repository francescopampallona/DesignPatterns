/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.command;

import static java.lang.System.exit;

/**
 *
 * @author franc
 */
public class Receiver {
    public void Action1(){
        System.out.println("Command1 execution...");
    }
    
    public void Action2(){
        System.out.println("Command2 execution...");
    }
    
    public void Exit(){
        exit(0);
    }
}
