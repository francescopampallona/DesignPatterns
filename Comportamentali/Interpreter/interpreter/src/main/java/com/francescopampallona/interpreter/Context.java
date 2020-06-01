/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francescopampallona.interpreter;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author franc
 */
public class Context {
    private final List<String> expressionList;
    private List<Integer> values;
    
    public Context(String operation){
     this.expressionList =  Arrays.asList(operation.split(" "));
    
    }

    public List<String> getExpressionList() {
        return expressionList;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }
    
    
    
    
}
