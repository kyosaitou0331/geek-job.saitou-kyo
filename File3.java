
import java.io.*;
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
public class File3 {
    public static void main(String[] args){
    try{
       File f=new File("text.txt");
   String na=("2000/01/01 12:00");
   String nu=("2000/04/04 11:00");
    SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy/MM/dd HH:mm"); 
    Date starttime = sdf.parse(na);
    Date endtime = sdf.parse(nu);
    System.out.println("開始時間は"+sdf.format(starttime));
    System.out.println("終了時間は"+sdf.format(endtime));
       FileWriter fw=new FileWriter(f);
       fw.write("処理の内容");
       fw.close();
    }catch(Exception e){
        System.out.print(e.toString());
    }
    }
}