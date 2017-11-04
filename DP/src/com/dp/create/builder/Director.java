/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.builder;

/**
 *
 * @author 15065
 */
public class Director {
    
    private ComputerBuilder cb = null;
    
    public void setBuilder(ComputerBuilder cbb){
        cb = cbb;
    }
    
    public Computer getComputer(){
        return cb.getComputer();
    }
    public void settype(String type){
        cb.setType(type);
    }
    public void contract(){
        cb.createComputer();
        cb.builderCpu();
        cb.builderCache();
        cb.builderDisk();
        cb.builderDisplay();
        cb.builderHost();
        cb.builderType();
    }
}
