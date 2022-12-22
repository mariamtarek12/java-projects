/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;
import java.util.Scanner;
/**
 *
 * @author Mariam Tarek
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("enter no. of rows ");
       int rows=input.nextInt();
       System.out.println("enter no. of coloumns ");
       int coloumn=input.nextInt();
       int[][] matrix=new int[rows][coloumn];
       for (int i=0;i<matrix.length;i++)
       {
           for(int j=0;j<matrix[0].length;j++)
           {
               System.out.println("enter the element of matrix");
               matrix[i][j]=input.nextInt();
               
           }
       
      }
       for (int j=0;j<matrix.length;j++)
       {
           for(int i=0;i<matrix[0].length;i++)
           {
               System.out.println("the transpose is " +matrix[i][j]);
            
               
           }
       
      }
      
       
       
       
    
    
}
}