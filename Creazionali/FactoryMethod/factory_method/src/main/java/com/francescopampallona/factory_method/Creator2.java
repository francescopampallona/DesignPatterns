/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.factory_method;

/**
 *
 * @author franc
 */
public class Creator2 extends Creator {
    @Override
    ConcreteObject2 createObject(){
    return new ConcreteObject2();
    }
}
