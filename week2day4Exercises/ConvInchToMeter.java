/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2day4ask7;

import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class ConvInchToMeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Give inches");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch+ " inch is " + meters + " meters");
        
    }
    
}
