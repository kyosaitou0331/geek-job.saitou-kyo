
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
public class day3 {
   public static void main(String[] args){
    SimpleDateFormat sdf =
            new SimpleDateFormat("2016'年'11'月'4'日' 10'時'0'分'0'秒'"
                    + "2016-11-04 10:00:00"); 
        Date d=new Date();
         System.out.print(sdf.format(d));
   }
}
