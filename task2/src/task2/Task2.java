/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;
import java.util.Scanner;
/**
 *
 * @author Mariam Tarek
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n , r , fact_n=1 , fact_r=1 , fact=1 ,nCr , nPr ;
        System.out.println("enter the value of n: ");
      n=input.nextInt();
        System.out.println("enter the value of r: ");
      r=input.nextInt();
         for(int i=1;i<=n;i++)
         {
             fact_n*=i;      //n!
         }
        for(int i=1;i<=r;i++)
        {
            fact_r*=i;     //r!
        }
         for(int i=1;i<=(n-r);i++)
        {
            fact*=i;     //(n-r)!
        }
         nCr= fact_n /(fact_r*fact);
         nPr= fact_n /fact;
         System.out.println("the combination is = "+ nCr);
          System.out.println("the permutation is = "+ nPr);
         
    }
    
}
