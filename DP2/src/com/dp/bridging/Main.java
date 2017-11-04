/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.bridging;

/**
 *
 * @author 15065
 */
public class Main {
    public static void main(String [] args){
        Office office = new Office();
        Wps wps  = new Wps();
        Word word = new Word();
        Ppt ppt = new Ppt();
        Excel excel = new Excel();
        
        wps.product();
        word.function();
        
        office.product();
        ppt.function();
        
        office.product();
        excel.function();
    }
}
