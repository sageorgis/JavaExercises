/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2day4ask1;

import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class Circle {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give a number for radius: ");
        System.out.println();
        float radius = input.nextFloat();
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*(radius*radius);
        System.out.printf("The area of a circle with %.2f radius is %f and the perimeter is %f \n", radius, perimeter, area);
    }
    
}
