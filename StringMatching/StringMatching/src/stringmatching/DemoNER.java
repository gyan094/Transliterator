/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmatching;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author india
 */
public class DemoNER {
    public static void main(String[] args) throws FileNotFoundException{
        String s= "hello";
   File br=null;
      String t=null;
      Scanner filescanner=null;
        try
        {
             br= new File("E:\\aa.txt");
             filescanner= new Scanner(br);
         while(filescanner.hasNext()){
               t=filescanner.next().toLowerCase();
             }
         char c= t.charAt(1);
         char st=s.charAt(0);
        System.out.println("the char at index 0 is"+c);
        System.out.println("the char at index 0 is=="+st);
        
        }catch (FileNotFoundException e){
        }
        }
    }