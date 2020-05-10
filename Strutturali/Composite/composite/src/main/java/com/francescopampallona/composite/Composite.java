/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */
public class Composite implements Component {
    private String name;
    List<Component> components;
  
    Composite(String name){
        this.name = name;
        components = new ArrayList();
    }
    
    @Override
    public void Operation(){
        System.out.println("Operation of composite");
    }
    
    @Override
    public void add(Component component){
        this.components.add(component);
    }
    
    @Override
    public void remove(Component component){
        this.components.remove(component);
    }
    
    @Override
    public void showComponents(){
        int n=0;
        for(Component c: components){
            System.out.println(c.getName());
            n++;
        }
        System.out.println(n + " compoenti");
    }
    
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
}
