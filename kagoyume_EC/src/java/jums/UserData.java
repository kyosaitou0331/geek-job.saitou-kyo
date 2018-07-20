
package jums;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author owner
 */
public class UserData implements Serializable{
    private String name;
    private String password;
    private String mail;
    private String address;
    private int total;
    private int deleteflag;
   
    
    public UserData(){
        this.name = "";
        this.password="";
        this.mail = "";
        this.address = "";
        this.total= 0;
        this.deleteflag= 0;
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

   public String getPassword() {
        return password;
    }
      public void setPassword(String password) {
       
        if(password.trim().length()==0){
            this.password = "";
        }else{
            this.password = password;
        }
    }

   public String getMail() {
          return mail;
      }
      public void setMail(String mail) {
       
         if(mail.trim().length()==0){
             this.mail = "";
        }else{
            this.mail = mail;
        }
    }
    public String getAddress() {
        return address;
       }
      public void setAddress(String address) {
       
        if(address.trim().length()==0){
            this.address = "";
        }else{
            this.address = address;
        }
    }
     public int getTotal() {
        return total;
    }
    public void setTotal(String total) {
        if(total == null){
            this.total= 0;
        }else{
            this.total= Integer.parseInt(total);
        }

    }
    
    public int getDeleteflag() {
        return deleteflag;
    }
    public void setDeleteflag(String deleteflag) {
        if(deleteflag == null){
            this.deleteflag = 0;
        }else{
            this.deleteflag = Integer.parseInt(deleteflag);
        }

    } 
      public ArrayList<String> chkproperties(){
        ArrayList<String> chkList = new ArrayList<String>();
        if(this.name.equals("")){
            chkList.add("name");
        }
        if(this.password.equals("")){
            chkList.add("password");
        }
        if(this.mail.equals("")){
            chkList.add("mail");
        }
        if(this.address.equals("")){
            chkList.add("address");
        }
        return chkList;
    }

    public void UDtoDTOMapping(UserDataDTO udd){
        udd.setName(this.name);
        udd.setPassword(this.password);
        udd.setMail(this.mail);
        udd.setAddress(this.address);
    }
    
}