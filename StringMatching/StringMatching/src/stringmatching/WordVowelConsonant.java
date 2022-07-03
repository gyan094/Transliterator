/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmatching;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author india
 */
public class WordVowelConsonant {
 public static void main (String args[]) throws Exception{
      File br=null;
      String t=null;
      Scanner filescanner=null;
        try
        {
             br= new File("E:\\abc.txt");
             filescanner= new Scanner(br);
         while(filescanner.hasNext()){
               t=filescanner.next().toLowerCase();
            char[] syllable= new char[50];
  for (int i = 0; i < t.length(); i++)
  {
     char c = t.charAt(i);
   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
    syllable[i]='V';
   else 
    syllable[i]='C';
  }
  System.out.println(t);
  for(int j=0;j < syllable.length;j++){
      System.out.print(syllable[j]);
  } 
  System.out.println("");
         }
        }catch (FileNotFoundException e){
        }
   }   
}
