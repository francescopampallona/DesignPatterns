/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.proxy;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Client {
    
    public static void main(String[] args){
        System.out.println("Enter secret password:");
        String password = new Scanner(System.in).nextLine();
        ProtectionProxy pp = new ProtectionProxy(password);
        pp.Request();
    }
    
   
    
}
