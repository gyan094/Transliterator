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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) throws IOException, NullPointerException {
  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the String:");
    String t = bf.readLine();
    char[] syllable= new char[50];
    String syllablecom[]= null;
      File br=null;
      String s=null;
      String k = null;
      Scanner filescanner=null;
  for (int i = 0; i < t.length(); i++)
  {
   char c = t.charAt(i);
   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
    syllable[i]='V';
   else 
    syllable[i]='C';
  }
  
  for(int m=0;m< syllablecom.length; m++)
  {
  for(int j=0;j < syllable.length;j++){
      System.out.print(syllable[j]);
      if(syllable[j]=='C' && syllable[j+1]== 'V')
      {
        if(syllable[j+2]=='V')
        {
           syllablecom[m]="CVV";
           j=j+3;
        }
        else
        {
            syllablecom[m]="CV";
            j=j+2;
        }
      }
      System.out.println("abcdse"+k);
  }
  }
 }
  public String[] syllableCombine(String arr[])
  {
  return arr;
  }
}
