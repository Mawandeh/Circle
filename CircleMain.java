/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.wsu.driver.s220236941;
import za.ac.wsu.s220236941.Circle;
/**
 *
 * @author mawande hlabe
 */
public class CircleMain {
    public static void main(String[] args){
        //creates 3 Circle objects
        Circle c1=new Circle();
        Circle c2=new Circle();
        Circle c3=new Circle();
        
        //set values to circle objects
        c1.setRadius(20);
        c1.setX(2);
        c1.setY(7);
        
        c2.setRadius(7);
        c2.setX(9);
        c2.setY(10);
        
        c3.setRadius(8);
        c3.setX(3);
        c3.setY(6);
        //displays the information of these circle
        System.out.println("Circle 1 Information");
        displayInformation(c1);
        System.out.println("\nCircle 3 Information");
        displayInformation(c2);
        System.out.println("\nCircle 3 Information");
        displayInformation(c3);  
    }
    /**
     * Displays information of circle
     * @param c
     */
    public static void displayInformation(Circle c){
        System.out.println("Radius:"+c.getRadius()+",Center:("+c.getX()+","+c.getY()+")");
        System.out.printf("Area:%.2f",c.calculateArea());
        System.out.printf("\nCircumference:%2f",c.calculateCircumference());
        System.out.printf("\nDiameter:%2f",c.calculateDiameter());
        System.out.println();
    }
    
}
