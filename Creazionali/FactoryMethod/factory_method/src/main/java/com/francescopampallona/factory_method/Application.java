/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.factory_method;

/**
 * Un framework usa classi astratte e interfacce per definire e mantenere 
 * relazione tra oggetti. Un framework è anche responsabile per la creazione di
 * oggetti.
 * In questo esempio il framework definirebbe soltanto
 * AbstractObject (che è un interfaccia) e Creator (che è una classe astratta).
 * 
 * L'utilizzatore del framework, che si occupa di sviluppare l'applicazione 
 * definisce Creator1, ..., CreatorN che sono le classi che si occupano di creare
 * i suoi oggetti concreti, rispettivamente ConcreteObject1, ..., ConcreteObjectN
 * 
 */
public class Application {
    
    public static void main (String[] args){
        Creator1 c1 = new Creator1();
        ConcreteObject1 co1 = c1.createObject();
        Creator2 c2 = new Creator2();
        ConcreteObject2 co2 = c2.createObject();
        
    }
}
