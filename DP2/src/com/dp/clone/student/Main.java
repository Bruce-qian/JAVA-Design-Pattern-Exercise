/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.clone.student;

/**
 *深克隆：成员变量被分开，不是共享一个存储块，不存在改一个所有对象中的对象值都随之改变
 * 浅克隆：与深克隆相反
 * @author 15065
 */
public class Main {
    public static void main(String [] args){
        Student stu1 = new Student("张三");
        Student stu2 = (Student)stu1.clone();
        stu2.setClass("这不是课程");
        stu2.setName("李四");
        
        System.out.println(stu1.getName());
        stu1.Class();
        
        
        System.out.println(stu2.getName());
        stu2.Class();
    }
}
