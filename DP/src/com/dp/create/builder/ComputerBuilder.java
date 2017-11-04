/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.builder;

/**
 *
 * @author 15065
 */
abstract class ComputerBuilder {
    
    protected Computer computer;
   
   protected String  type = null;
    /*
    protected String cache = null;
   protected String host = null;
    protected String display  = null;
    protected String disk = null;
    * */
    
    public Computer getComputer(){
        return computer;
    }
    public void createComputer(){
        computer = new Computer();
    }
    
    public void setType(String str){
        type = str;
    }
    public abstract void builderCpu();
    public abstract void builderCache();
    public abstract void builderHost();
    public abstract void builderDisplay();
    public abstract void builderDisk();
    public abstract void builderType();
}
