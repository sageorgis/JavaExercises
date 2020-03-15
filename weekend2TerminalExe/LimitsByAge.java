import java.util.Scanner;

public class LimitsByAge{

	public static void main(String [] args){
			
		Scanner input = new Scanner(System.in);
		System.out.println("Give your age: ");
		int age = input.nextInt();
		boolean correct = true;
		while(correct){
			if (age >0 && age<=15){
				System.out.println("You can not drive!");
				break;
			}else if (age >= 16 && age <= 17){
				System.out.println("You can drive but not vote!");
				break;
			}else if (age >=18 && age <= 21){
				System.out.println("You can vote but not drink!");
				break;
			}else if (age >= 22 && age<=100){
				System.out.println("You can do anything!");
				correct = false;
			}else{
				System.out.println("Wrong Number. Try again with a number between 1-100");
				age = input.nextInt();
				correct = true;
			}
		}
	}
}