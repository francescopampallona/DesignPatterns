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
public class ProtectionProxy implements Subject{
    private final RealSubject real_subject;
    private final String secret_code;
    ProtectionProxy(String secret_code){
    this.secret_code = secret_code;
    real_subject = new RealSubject();
    }
    

    @Override
    public void Request(){
        //SISTEMA DI PROTEZIONE FITTIZIO
        if(this.secret_code.equals("laMiaPassword")){
           this.real_subject.Request();
        }
        else{
        System.out.println("Access denied!!!");
        }
    }
   
    
}
