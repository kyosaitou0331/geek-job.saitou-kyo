
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class File2 {
     public static void main(String[] args){
    try{    
        File f=new File("text.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }catch(Exception e){
        System.out.println(e.toString());
    }
}}
