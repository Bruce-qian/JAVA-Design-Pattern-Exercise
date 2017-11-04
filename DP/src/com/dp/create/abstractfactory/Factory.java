/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.abstractfactory;

/**
 *
 * @author 15065
 */
public abstract class Factory {
    public static final String KFC = "KFC";
    public static final String Mcd = "McDonald";
    public abstract String getInfo();
   // public abstract Product getEate();
    public abstract Product order(String tp);
    static Factory getFactory(String type){
        Factory fac = null;
        if(type.equals(Factory.KFC)){
            fac = new Kfcfactory();
        }
        else if(type.equals(Factory.Mcd)){
            fac = new Mcdfactory();
        }
        return  fac;
    }
}
