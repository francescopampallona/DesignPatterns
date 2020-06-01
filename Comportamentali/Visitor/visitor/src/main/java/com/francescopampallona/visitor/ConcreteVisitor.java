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
public class ConcreteVisitor implements Visitor{
    private double total_weight = 0;
    @Override
   public void VisitConcreteElement1(ConcreteElement1 e1){
       this.total_weight += e1.getWeight();
   }
   
   @Override
    public void VisitConcreteElement2(ConcreteElement2 e2){
        this.total_weight+=e2.getWeight();
    }  

    public double getTotal_weight() {
        return total_weight;
    }
   
}
