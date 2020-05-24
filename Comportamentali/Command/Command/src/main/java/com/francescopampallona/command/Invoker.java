/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.command;

import java.util.HashMap;

/**
 *
 * @author franc
 */
public class Invoker {
    
    private final HashMap<String, Command> commandRegister = new HashMap<>();
    
    public void StoreCommand(String commandName, Command command) {
        commandRegister.put(commandName, command);
    }
    
    public void execute(String commandName){
        if(commandRegister.containsKey(commandName)){
        Command command = commandRegister.get(commandName);
        command.Execute();
        }
        else{
            System.out.println("Command not recognized!!!");
        }
    
    }
    
}
