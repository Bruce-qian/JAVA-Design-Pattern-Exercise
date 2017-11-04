/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.builder;

/**
 *
 * @author 15065
 */
public class BuilderFactory {
    ComputerBuilder builder = null;
    public  ComputerBuilder getBuilder(String type){
        if(type.equals("笔记本"))
            builder = new Laptabbuilder();
        if(type.equals("台式机"))
            builder = new TaishiBuilder();
        if(type.equals("服务器"))
            builder = new ServerBuilder();
        
        return builder;
    }
}
