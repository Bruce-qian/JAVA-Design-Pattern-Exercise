/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.factorymethod;

/**
 *
 * @author 15065
 */
public class CreateDair implements Factory{
    Product pro = null;
    public Product create(){
        pro = new Productdair();
        return pro;
    }
}
