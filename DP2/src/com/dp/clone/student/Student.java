/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.clone.student;

/**
 *
 * @author 15065
 */
public class Student implements Cloneable{
    private String name;
    ClassSchedule cs = new ClassSchedule();
    
    Student(){}
    Student(String name){
      this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public Object clone(){
        //深克隆方法
        Student stu = null;
        try{
            stu = (Student)super.clone();
            stu.cs = (ClassSchedule)cs.clone();//将此处注释掉就是浅克隆
        }catch(Exception e){
            
        }
        return stu;
    }
    public void Class(){
        cs.classchose();
    }
    public void setClass(String str){
        cs.setStr(str);
    }
}
