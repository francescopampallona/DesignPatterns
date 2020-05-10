/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.composite;

/**
 *
 * @author franc
 */
public class Leaf2 implements Component{
    
    private String name;
     
    Leaf2(String name){
        this.name = name;
    }
    
    @Override
    public void Operation(){
        System.out.println("---Operation of Leaf2 ---");
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void add(Component c){
        System.out.println("Impossible to add!");
    }
    
    @Override
    public void remove(Component c){
        System.out.println("Impossible to remove!");
    
    }
    
    @Override
    public void showComponents(){
        System.out.println("A primitive object does not have components!!!");
    
    }
    
    
}
