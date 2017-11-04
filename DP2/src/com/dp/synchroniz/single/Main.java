/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.synchroniz.single;

/**
 *
 * @author 15065
 */
public class Main {
    public static void main(String [] args){
         Student stu2 = Student.getInstance("里斯");
        Student stu1 = Student.getInstance("张三");
       
        stu1.goClass();
        stu2.goClass();
    }
}
