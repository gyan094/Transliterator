/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmatching;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author india
 */
public class StringMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        try
        {
         String sCurrentLine;
         br= new BufferedReader(new FileReader("E:\\abc.txt"));
         while((sCurrentLine = br.readLine()) != null){
             System.out.println(sCurrentLine);
         }
        }catch (IOException e){
            e.printStackTrace();
         br.close();
        }
    }
    
}
