package jums;

import java.util.ArrayList;

/**
 * 
 * @author hayashi-s
 */
public class JumsHelper {
    
    private final String homeURL = "index.jsp";
    
    public static JumsHelper getInstance(){
        return new JumsHelper();
    }
    
    
    public String home(){
        return "<a href=\""+homeURL+"\">トップへ戻る</a>";
    }
    
    public String exTypenum(int i){
        switch(i){
            case 1:
                return "急ぎ配送";
            case 2:
                return "通常配送";
        }
        return "";
    }
    
   
    public String chkinput(ArrayList<String> chkList){
        String output = "";
        for(String val : chkList){
                if(val.equals("name")){
                    output += "名前";
                }
                if(val.equals("password")){
                    output +="パスワード";
                }
                if(val.equals("mail")){
                    output +="メールアドレス";
                }
                if(val.equals("address")){
                    output +="住所";
                }
                output +="が未記入です<br>";
            }
        return output;
    }
}
