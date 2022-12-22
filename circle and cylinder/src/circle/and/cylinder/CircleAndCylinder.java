/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle.and.cylinder;
class circle {
  String colour="red";
  double radius=1.0;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
        
    }
     public circle(double radius,String colour ) {
        this.radius = radius;
        this.colour= colour;
        
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle{" + "colour=" + colour + ", radius=" + radius + '}';
    }
public double getarea(){
    return 3.14*radius*radius;
}
 
}
class cylinder extends circle {
    double hight=1;

    public cylinder() {
    }

    public cylinder(double radius,double hight) {
        super(radius);
        this.hight= hight;
        
    }

    public cylinder(double radius, String colour,double hight) {
        super(radius, colour);
         this.hight= hight;
    }

    @Override
    public String toString() {
        return "cylinder{" + "hight=" + hight + '}';
    }
    public double getvolume(){
        
     return super.getarea()*hight;
     
    }
    
}


/**
 *
 * @author Mariam Tarek
 */
public class CircleAndCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circle c = new circle();
        System.out.println(c.getarea());
        
        cylinder cy= new cylinder();
        System.out.println(cy.getvolume());
        
        
    }
    
}
