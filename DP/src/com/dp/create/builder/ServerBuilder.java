/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.builder;

/**
 *
 * @author 15065
 */
public class ServerBuilder extends ComputerBuilder{
    public void builderType(){
        computer.setType(type);
    }
    public  void builderCpu(){
        computer.setCpu();
    }
    public void builderCache(){
        computer.setCache();
    }
    public void builderHost(){
        computer.setHost();
    }
    public  void builderDisplay(){
        //computer.setDisplay();
    }
    public void  builderDisk(){
        computer.setDisk();
    }
}
