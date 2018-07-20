package jums;

import java.io.Serializable;

public class SearchAPI implements Serializable{
    private String name;
    private int price;
    private String code;
    private String description;
    private String image;
    
    public SearchAPI(){
        this.name = "";
        this.price=0;
        this.code = "";
        this.description = "";
        this.image="";
      }
    
   public String getName() {
        return name;
    }
    public void setName(String name) {
       
        if(name.trim().length()==0){
            this.name = "";
        }else{
            this.name = name;
        }
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(String price) {
        if(price == null){
            this.price= 0;
        }else{
            this.price= Integer.parseInt(price);
        }

    }
   public String getCode() {
        return code;
    }
      public void setCode(String code) {
       
        if(code.trim().length()==0){
            this.code = "";
        }else{
            this.code = code;
        }
    }

   public String getDescription() {
          return description;
      }
      public void setDescription(String description) {
       
         if(description.trim().length()==0){
             this.description = "";
        }else{
            this.description = description;
        }
    }
     public String getImage() {
          return image;
      }
      public void setImage(String image) {
       
         if(image.trim().length()==0){
             this.image = "";
        }else{
            this.image = image;
        }
    }
}