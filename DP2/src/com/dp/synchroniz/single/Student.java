/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.synchroniz.single;

/**
 *
 * @author 15065
 */
public class Student {
    private String name;
    private static Student stu;
    Student(){
    name = "null";
    }
    Student(String name){
        this.name = name;
    }
    
    public static synchronized Student getInstance(String name){
        if(stu == null && name!= null){
            stu = new Student(name);
        }
        return stu;
    }
    
    public void goClass(){
        System.out.println(name + "去上课");
    }
}
