/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.mediator;

/**
 *
 * @author franc
 */
public class Client {
    public static void main(String[] args){
    Mediator mediator = new ConcreteMediator();
    Colleague c1 = new ConcreteColleague1(mediator);
    Colleague c11 = new ConcreteColleague1(mediator);
    Colleague c2 = new ConcreteColleague2(mediator);
    c1.sendToAll("Hello world!");
    System.out.println("_____________________________________");
    c11.send("Hello", c1);
    }
}
