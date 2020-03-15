import java.util.Scanner;


public class BestFriends{
	
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		String [] friends = new String[4];
		boolean isNotFull = true;
		while(isNotFull){
			for (int i=0; i<friends.length; i++){
				System.out.println("Give " + (i+1) + " friends name");
				friends[i] = input.next();
			}
			isNotFull = false;
		}
		do{	
			System.out.println("My best friends are: ");
			for (String name: friends){
				System.out.println(name);
			}
		}while(isNotFull);
	}
}
			
		