/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.visitor;

/**
 *
 * @author franc
 */
public class ConcreteElement2 implements Element {
    private double weight;

    public ConcreteElement2(double weight) {
        this.weight = weight;
    }
    
    
    
    @Override
    public void Accept(Visitor visitor){
       visitor.VisitConcreteElement2(this);
    }

    public double getWeight() {
        return weight;
    }
    
    
}
