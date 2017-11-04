/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.adapter;

/**
 *
 * @author 15065
 */
public class Adapter  implements ComputerAdapter{
    private Richang ri;
    public void change(){
        ri = new Richang();
        System.out.println("电压转换");
        ri.inPut();
        this.outPut();
    }
    public void outPut(){
         System.out.println("输出电压16-20v");
    }
}
