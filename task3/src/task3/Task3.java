/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;
import java.util.Scanner;
/**
 *
 * @author Mariam Tarek
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        int size;
        System.out.println("enter size of array");
        size=input.nextInt();
        int[] array=new int[size];
        for(int i=0; i<array.length;i++)
        {
            System.out.println("enter the element" + (i+1));
            array[i]=input.nextInt();
        }
        int max=array[0];
       for(int i=0; i<array.length;i++)
       {
       if(max<array[i])
           max=array[i];
        
    }
    System.out.println("tha maximum element is " +max );
}
}