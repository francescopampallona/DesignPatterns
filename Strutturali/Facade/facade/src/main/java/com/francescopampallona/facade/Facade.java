/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.facade;

/**
 *
 * @author franc
 */
public class Facade {
 private final Subsystem1 subsystem1;
 private final Subsystem2 subsystem2;
 
 Facade(){
 this.subsystem1 = new Subsystem1();
 this.subsystem2 = new Subsystem2();
 }
 public void start(){
     System.out.println("System running...");
     this.subsystem1.operationSubsystem1();
     this.subsystem2.operationSubsystem2();
     System.out.println("---END---");
 }
}
