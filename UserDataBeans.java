/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.io.Serializable;

/**
 *
 * @author owner
 */
public class UserDataBeans implements Serializable {
    private String name="";
    private String year="";
    private String month="";
    private String day="";
    private String type="";
    private String tell="";
    private String comment="";
    
    public UserDataBeans(){}
    
    public String getName(){return this.name;}
    public void setName(String a) { this.name = a; }
    
    public String getYear(){return this.year;}
    public void setYear(String b){this.year=b;}
    
    public String getMonth(){return this.month;}
    public void setMonth(String c){this.month=c;}
    
    public String getDay(){return this.day;}
    public void setDay(String d){this.day=d;}
    
    public String getType(){return this.type;}
    public void setType(String e) {this.type=e;}
    
    public String getTell(){return this.tell;}
    public void setTell(String f){this.tell=f;}
    
    public String getComment(){return this.comment;}
    public void setComment(String g){this.comment=g;}
    
    
    
    
    
}
    

