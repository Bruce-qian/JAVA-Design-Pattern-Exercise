/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.abstractfactory;

/**
 *
 * @author 15065
 */
public class Kfcfactory extends Factory{
    public Product order(String tp){
        Product pro = null;
        if(tp.compareTo("coffee") == 0)
            pro =  new Drink();
        else if(tp.compareTo("Hamburger") == 0)
            pro =  new Eate();
        return pro;
      };
    
    public String getInfo(){
        return "KFC";
    }
}
