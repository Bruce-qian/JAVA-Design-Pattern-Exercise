/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.builder;

/**
 *
 * @author 15065
 */
public class Client {
    public static void main(String [] args){
        String type = "服务器";//取值： 笔记本， 台式机， 服务器
        BuilderFactory builderfactory = new BuilderFactory();
        ComputerBuilder builder = builderfactory.getBuilder(type);
        Director dt = new Director();
       dt.setBuilder(builder);
       dt.settype(type);
       dt.contract();
       Computer cp = dt.getComputer();
       System.out.println(cp.getInfo());
    }
}
