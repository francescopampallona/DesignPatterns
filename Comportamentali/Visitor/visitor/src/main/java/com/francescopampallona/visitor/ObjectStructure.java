/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */
public class ObjectStructure {
    private List<Element> elements;
    
    ObjectStructure(){
        elements = new ArrayList<>();
        elements.add(new ConcreteElement1(3));
        elements.add(new ConcreteElement1(1));
        elements.add(new ConcreteElement2(5));
    }
    
    public void visitElements(){
        ConcreteVisitor v = new ConcreteVisitor();
        
        elements.forEach(e -> {e.Accept(v);});
        
        double total_weight = v.getTotal_weight();
        
        System.out.println("The average weight is " + total_weight/(elements.size()));
    }
}
