/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.decorator;

/**
 *
 * @author franc
 */
public class Client {
    
    public static void main(String[] args){
      System.out.println("Basic usage of ConcreteComponent!!");
      Component c = new ConcreteComponent();
      c.Operation();
      //Componente decorato con il decoratore concreto A
      System.out.println("------------------------------------------------------");
      Component decorated_component = new ConcreteDecoratorA(new ConcreteComponent());
      decorated_component.Operation();
      //Component con più decorazioni
      System.out.println("------------------------------------------------------");
      System.out.println("Component wich uses more decorators");
      Component multiDecorated_component = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));
      multiDecorated_component.Operation();
      
    }
    
}
