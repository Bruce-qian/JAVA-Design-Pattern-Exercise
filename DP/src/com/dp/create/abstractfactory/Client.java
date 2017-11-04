/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.abstractfactory;

/**
 *
 * @author 15065
 */
public class Client {
    public static void main(String [] args){
        String type = "KFC";
        String tp = "coffee";
        //String tp = "McDonald";
        Factory fac = Factory.getFactory(type);
        Product pro = null;
        pro = fac.order(tp);
        System.out.println(fac.getInfo() + " " + pro.getInfo());
    }
}
