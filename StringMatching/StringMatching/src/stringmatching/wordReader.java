/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmatching;

/**
 *
 * @author india
 */

import java.io.*;
import java.util.Scanner;


public class wordReader{
   public static void main (String args[]) throws Exception{
      File br=null;
      Scanner filescanner=null;
        try
        {
             br= new File("E:\\abc.txt");
             filescanner= new Scanner(br);
         while(filescanner.hasNext()){
             System.out.println(filescanner.next());
         }
        }catch (IOException e){
            e.printStackTrace();
        }
   }
}