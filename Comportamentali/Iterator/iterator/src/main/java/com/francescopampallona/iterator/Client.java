/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.iterator;

import java.util.ListIterator;
import java.util.ArrayList;
/**
 *
 * @author franc
 */
public class Client {
    
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add("C");
        lista.add("A");
        lista.add("D");
        
        ListIterator iterator = lista.listIterator();
        
        System.out.println("ITERATOR USED FOR UPDATING OF A LIST: ");
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.println(element);
            if(element.equals("A")){
                iterator.remove();
            }
        }
        System.out.println("--------------------------------------");
       
        System.out.println("If you need to go accross the "
                + "collection only for reading and not for updating the list"
                + ", you can use simply foreach");
        //GO ACROSS THE LIST USING FOREACH AND LAMBDA EXPRESSIONS(JAVA 8)
        lista.forEach(element-> {
            System.out.println(element);
            /*
            _____________________________
            THIS CODE DOES NOT WORK, IT THROWS AN EXCEPTION
            if(element.equals("A")){
                lista.remove(element);
            } 
            ______________________________
            */
        });
    }
    
}
