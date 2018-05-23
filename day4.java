
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class day4 {
    public static void main(String[] args){ 
    try{
    String na=("2015/01/01 00:00:00");
    String nu=("2015/12/31 11:59:59");
    SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
    Date date1 = sdf.parse(na);
    Date date2 = sdf.parse(nu);
    
    long nam = date1.getTime();
    long num = date2.getTime();
    long date3 = ( nam - num  ) / (1000 );
  
    System.out.println( sdf.format(date1) );
    System.out.println( sdf.format(date2) );
    System.out.println( "差は " + date3);
    }catch(Exception e){
        System.out.println(e.toString());
    }
                }
    }
