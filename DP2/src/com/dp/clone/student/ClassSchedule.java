/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.clone.student;

/**
 *
 * @author 15065
 */
public class ClassSchedule implements Cloneable{
    String str = "这是学生选择的课程";
    public void classchose(){
        System.out.println(str);
    }
    public void setStr(String str){
        this.str = str;
    }
    public Object clone(){
        ClassSchedule cs = null;
        try{
            cs = (ClassSchedule)super.clone();
        }catch(Exception e){
        
        }
        return cs;
    }
}
