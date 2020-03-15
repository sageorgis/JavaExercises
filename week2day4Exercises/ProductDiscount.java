/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2day4ask8;

import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class ProductDiscount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Give a price");
        double priceD = input.nextDouble();
        System.out.println("10% of the price is " + (priceD*0.1) + " 20% of the price is "+ (priceD*0.2) +" 30% of the price is " + (priceD*0.3) + " 40% of the price is 10% of the price is " + (priceD*0.4)  + " 50% of the price is " + (priceD*0.5)   + " 60% of the price is " + (priceD*0.6));
    }
    
}
