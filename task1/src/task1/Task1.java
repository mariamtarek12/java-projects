/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Scanner;
/**
 *
 * @author Mariam Tarek
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("enter the ASCII value: ");
        int ASCII=input.nextInt();
        char c =(char) ASCII;
        System.out.println("the element is: " + c);
    }
    
}
