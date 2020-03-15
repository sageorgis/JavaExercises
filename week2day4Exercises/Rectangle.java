
package week2day4ask3;

import java.util.Scanner;


public class Rectangle {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give width: ");
        float width = input.nextFloat();
        System.out.println("Give height");
        float height = input.nextFloat();
        float area = width*height;
        float perimeter = 2*(width+height);
        System.out.printf("The rectangle has area %.2f and perimeter %.2f \n", area, perimeter);
    }
    
}
