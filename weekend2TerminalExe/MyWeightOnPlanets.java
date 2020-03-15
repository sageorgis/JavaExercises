import java.util.Scanner;

public class MyWeightOnPlanets{
	
	public static void main(String [] args){
		String [] planets = {"Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Nepture"};
		double [] gravities = {0.78, 0.39, 2.65, 1.17, 1.05, 1.23};
		Scanner input = new Scanner(System.in);
		System.out.println("Give your weight");
		int weight = input.nextInt();
		System.out.println("Choose one of the following planets");
		System.out.println("# " + " Planet " + " Relative gravity");
		for (int i=0; i<planets.length; i++){
			System.out.println(i+1 + "  " + planets[i] + "  " + gravities[i]);
		}
		String p = input.next();
		for (int i=0; i<planets.length; i++){
			if (p.equals(planets[i])){
				System.out.println("Your weight on planet " + planets[i] + " is over " + (int)(weight*gravities[i]) + " kg");
			}
		}
	}
}
	
			