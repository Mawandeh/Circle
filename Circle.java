/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.wsu.s220236941;

/**
 *
 * @author mawande hlabe
 */
public class Circle {
    //a.attributes
    private double radius;
    private int x;
    private int y;

    /**
     * @return the area of the circle
     */
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    /**
     * @return the circumference of the circle
     */
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }
    /**
     * @return diameter of circle
     */
    public double calculateDiameter(){
        return 2*radius;
    }
    /**
     * setter for radius
     *
     * @param radius the radius to set
     */
    public void setRadius(double radius){
        //check if radius cannot be less than zero
                if(radius<0){
                    this.radius=0;
                }else {
                    this.radius=radius;
                }
    }
    /**
     * Setter for radius
     *
     * @param x the x set
     */
    public void setX(int x){
        this.x=x;
    }
    /**
     * Setter for radius
     *
     * @param y the y to set
     */
    public void setY(int y){
        this.y=y;
    }
    /**
     * getter for radius
     *
     * @return radius
     */
    public double getRadius(){
        return radius;
    }
    /**
     * getter for x
     *
     * @return x
     */
    public int getX(){
        return x;
    }
    /**
     * getter for y
     *
     * @return y
     */
    public int getY(){
        return y;
    }
  
}
