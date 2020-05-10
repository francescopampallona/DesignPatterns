/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.bridge;

/**
 *
 * @author franc
 */
public class Client {
    public static void main(String[] args){
        ConcreteImplementor3 ci = new ConcreteImplementor3();
        RefinedAbstraction refined_abstraction = new RefinedAbstraction(ci);
        refined_abstraction.refined_operation();
    }
}
