/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop3;
import java.util.Scanner;
/**
 *
 * @author Mariam Tarek
 */
interface product {

    public  abstract double price(double p);}

    class book implements product {
        double book_price;
        public book() {
        }
        public double price(double p){
            p=book_price*0.9;
            return p;}
    }

            class childrenbook extends book {

                double childrenbook_price;
                public childrenbook() {
                }


                public double price(double b) {
                    childrenbook_price  =b  *0.6;
                return childrenbook_price;}
            }
public class OnlineShop3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
    }
    
}
