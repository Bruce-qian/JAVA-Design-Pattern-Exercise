/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.factorymethod;

/**
 *
 * @author 15065
 */
public class Client {
    public static void main(String [] args){
        Factory fac = null;
        fac = new Createlenove();
        //fac = new CreateDair();
        Product pro = fac.create();
        System.out.println(pro.getInfoto());
    }
}
