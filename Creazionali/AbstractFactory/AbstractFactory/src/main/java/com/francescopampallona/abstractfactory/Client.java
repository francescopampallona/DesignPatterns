/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.abstractfactory;

/**
 *
 * @author franc
 */
public class Client {
    public static void main(String[] args){
        AbstractFactory f = AbstractFactory.getFactory(1);
        if(f!=null){
            AbstractProductA productA= f.CreateProductA();
            AbstractProductB productB = f.CreateProductB();
        }
        else{
            System.out.println("Error!!!");
        }
    }
}
