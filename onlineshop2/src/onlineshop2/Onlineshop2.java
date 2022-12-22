/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop2;
import java.util.Scanner;
/**
 *
 * @author Mariam Tarek
 */
abstract class product {

    public  abstract double price(double p);}

    class book extends product {
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
public class Onlineshop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
                            System.out.print("please enter number of books : ");
                            int size = input.nextInt();
                            product[] arr = new childrenbook[size];


                            double price;
                            double total = 0;
                            for (int i = 0; i < size; i++) {
                                System.out.print("enter price of the book " + (i + 1) + ": ");
                                price = input.nextDouble();
                                arr[i] = new childrenbook();
                                arr[i].price(price);
                                total = total + arr[i].price(price);

                            }
                            System.out.print("total prices of the books :" + total);

                        }

                    }
    
    

