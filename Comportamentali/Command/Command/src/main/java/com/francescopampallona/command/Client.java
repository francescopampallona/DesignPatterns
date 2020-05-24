/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.command;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Client {
    public static void main(String[] args){
        Receiver rcvr = new Receiver();
        Invoker invoker = new Invoker();
        invoker.StoreCommand("c1", new ConcreteCommand1(rcvr));
        invoker.StoreCommand("c2", new ConcreteCommand2(rcvr));
        invoker.StoreCommand("exit", new ExitCommand(rcvr));
        
        while(true){
            System.out.println("Insert a command: ");
            String command = new Scanner(System.in).nextLine();
            invoker.execute(command);
            System.out.println("____________________________________________");
        }
    }
}
