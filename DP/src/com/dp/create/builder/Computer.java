/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.create.builder;

/**
 *
 * @author 15065
 */
public class Computer {
    private String type = null;
    private String  cpu = null;
    private String cache = null;
    private String host = null;
    private String display  = null;
    private String disk = null;
    public void setCpu(){
        cpu = "G4560";
    }
    public void setCache(){
        cache = "DDR4 2133 8G";
    }
    public void setHost(){
        host = "H110M ProVD";
    }
    public void setDisk(){
        disk = "西数1T";
    }
    public void setDisplay(){
        display = "AOC";
    }
    public void setType(String type){
        this.type = type;
    }
    
    public String getInfo(){
        String info = null;
        info = type + " " +cpu + " "  +  cache + " " + host + " " + display + " " + disk;
        return info;
    }
}
