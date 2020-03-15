import java.util.Scanner;

public class Grades{
	
	public static void main(String [] args) {
		System.out.println("Give a grade from A-F");
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		
		switch(c){
			case 'A':
			case 'a':
				System.out.println("Perfect. You passed");
				break;
			case 'B':
			case 'b':
				System.out.println("Good. You passed");
				break;
			case 'C':
			case 'D':
			case 'c':
			case 'd':
				System.out.println("Pass");
				break;
			case 'E':
			case 'F':
			case 'e':
			case 'f':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Wrong grade");
				break;
		}
	}
}