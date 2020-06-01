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
public interface Element {
  public void Accept(Visitor visitor);
  
}
