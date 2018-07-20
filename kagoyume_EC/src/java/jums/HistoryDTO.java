package jums;

import java.sql.Timestamp;


public class HistoryDTO {
    private String name;
    private int buyID;
    private String itemcode;
    private int type;
    private String image;
    private Timestamp buyDate;
    
   
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getBuyID() {
        return buyID;
    }
    public void setBuyID(int buyID) {
        this.buyID = buyID;
    }
   
    public String getItemcode(){
        return itemcode;
    }
    public void setItemcode(String itemcode){
        this.itemcode = itemcode;
    }
    
    public int getType(){
        return type;
    }
    public void setType(int type){
        this.type = type;
    }
    
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }
    
    public Timestamp getBuyDate() {
        return buyDate;
    }
    public void setBuyDate(Timestamp buyDate) {
        this.buyDate = buyDate;
    }
}