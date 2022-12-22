/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;
import java.util.Scanner;
/**
 *
 * @author Mariam Tarek
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String line = "hello , my name , is , mariam ";
        for (int i=0 ; i<line.length(); i++){
        char ch = line.charAt(i);
        if (ch==','){
          line= line.replaceAll(",", "");
        }
        }
        System.out.println(line);
    }
    
}
