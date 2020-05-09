/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.prototype;
/**
 *
 * @author franc
 */
public class Creator {
    AbstractObject createObject(String class_name) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
     Class c = Class.forName(class_name);
     return (AbstractObject)c.newInstance();
    }
}
