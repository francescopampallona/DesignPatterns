/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.flyweight;

/**
 *
 * @author franc
 */
public interface Flyweight {
    
    public void setExternalState(String externalState);
    
    public String getKey();
    
}
