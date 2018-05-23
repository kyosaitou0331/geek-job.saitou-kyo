
import java.sql.Timestamp;
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
public class day1 {
    public static void main(String[] args){
        String num="2016/1/1 00:00:00"; 
        SimpleDateFormat sdf =
            new SimpleDateFormat("2016'年'1'月'1'日' 0'時'0'分'0'秒'"); 
        Date d=new Date();
         System.out.print(sdf.format(d));
    }  
}
