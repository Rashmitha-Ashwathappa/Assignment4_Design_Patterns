/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Demonstrate the implementation and usage of facade design pattern.
 * 
 * @author Rashmitha
 * @version 1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker= new ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}