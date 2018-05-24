
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
public class File1 {
    public static void main(String[] args){
    try{    
        File f=new File("text.txt");
        FileWriter fw=new FileWriter(f);
        fw.write("私は齊藤京です。趣味はスノーボードです。");
        fw.close();
    }catch(Exception e){
        System.out.print(e.toString());
    }
    } 
}
