import java.util.Scanner;

public class DaysOfMonths{

	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give the number you want from 1-12");
		String [] array = {"January","February","March","April","May","June","July","August","September","Octomber","November","December"};

		for(int i=0; i<array.length;i++){
			System.out.println(i+1 + "." + array[i]);
		}
		int c = input.nextInt();

		switch(c){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(array[c-1] + " has " + " 31 days!");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(array[c-1] + " has " + " 30 days!");
				break;
			case 2:
				System.out.println(array[c-1] + " has " + " 29 days!");
				break;
			default:
				System.out.println("You give a wrong number.");
				break;
		}
	}
}