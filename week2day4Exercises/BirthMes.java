/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2day4ask5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class BirthMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList <String> names=new ArrayList();
        ArrayList <Integer> numbers=new ArrayList();

        for (int i=0; i<3; i++){
            System.out.println("Give " + (i+1) + " name: " );
            names.add(input.next());
            System.out.println("Give " + (i+1) + " person year of birth: " );
            numbers.add(input.nextInt());
        }
        
        for (int i=0; i<3; i++){
            System.out.print("The " + (i+1) + " name is: "+ names.get(i));
            System.out.println(" and the year of birth: " +numbers.get(i) );
            
        }
    }
    
}
