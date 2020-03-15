/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2day4ask4;

import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class ConvertSeconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Give seconds: ");
        int sec = input.nextInt();
        int hour = convertSecToHour(sec);
        int min = convertSecToMin(sec);
        System.out.printf(sec + " seconds are " + min + " minutes and " + hour + " hours", sec, min, hour);
        
    }
    
    static int convertSecToHour(int sec){
        int hour = (int) (sec/3600);
        return hour;
        
    }
    
    static int convertSecToMin(int sec){
        int min = (sec%3600)/60;
        return min;
        
    }
}
