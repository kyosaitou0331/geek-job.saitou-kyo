
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class day2 { public static void main(String[] args){
        String num="2016/1/1 00:00:00"; 
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy'年'MM'月'dd'日' HH'時'mm'分'ss'秒'"); 
        Date d=new Date();
         System.out.print(sdf.format(d));
    }  
    
}
