/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2day4ask6;

import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class FahrToCel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float temp;
        System.out.println("Enter temperature in Fahrenheit");
        temp = input.nextFloat();
        temp = ((temp -32)*5)/9;
        System.out.println("Temperature in Celsius = " + temp);
    }
    
}
