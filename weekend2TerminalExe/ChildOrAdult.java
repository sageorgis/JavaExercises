
import java.util.Scanner;

public class ChildOrAdult{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Give your age");
		int myAge = input.nextInt();
		String ageCategory = myAge<18? "a child!" : "an adult!";
		System.out.println("Your age is " + myAge + " so you are " + ageCategory);
	}
}