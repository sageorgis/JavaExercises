import java.util.Scanner;

public class EveryDay{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);

		String [] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

		for(int i=0; i<array.length; i++){
			System.out.println("Give " + (i+1) + " for " + array[i]);
		}
		
		System.out.println("Give the number you want: ");
		
		int i = input.nextInt();

		switch(i){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			
				System.out.println("You pick " + array[i-1] + " so you go to work.");
				break;
			case 6:
			case 7:
				System.out.println("You pick " + array[i-1] + " so you relaxing.");
				break;	
			default:
				System.out.println("You give a wrong number."); 
				break;
		}
	}
}