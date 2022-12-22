/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;
 class Circle {
    double raduis=1.0;

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public String toString() {
        return "Circle{" + "raduis=" + raduis + '}';
    }
    
    public double getarea(){
        return 3.14*raduis*raduis;
    }
    public double getcircumferience(){
        return 3.14*2*raduis;
    }
    
    }
  class Triangle {
    double base=1.0; 
    double height=1.0;
    double side1=1.0;
    double side2=1.0;
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + ", side1=" + side1 + ", side2=" + side2 + '}';
    }
    

  
    public double getarea(){
        return 0.5*base*height;
    }
     
    public double getcircumference(){
        return side1+side2+base;
    }
    
    
}


/**
 *
 * @author Mariam Tarek
 */
public class Task6 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Circle c= new Circle();
       System.out.println("the area of cricle is: " +c.getarea());
       System.out.println("the circumferience of cricle is: " +c.getcircumferience());
       
        Triangle t=new Triangle();
        System.out.println("the area of triangle is: " +t.getarea());
        System.out.println("the circumferience of triangle is: " +t.getcircumference());
        
    }
    
}
