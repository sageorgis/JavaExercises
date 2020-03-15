import java.util.Scanner;


public class BestFriends{
	
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		String name="";
		String [] friends = {name, name, name, name};
		boolean isNotFull = true;
		while(isNotFull){
			for (int i=0; i<friends.length; i++){
				System.out.println("Give " + (i+1) + " friends name");
				name = input.next();
				friends[i]=name;
			}
			isNotFull = false;
		}
		do{	
			System.out.println("My best friends are: ");
			for (String n: friends){
				System.out.println(n);
			}
		}while(isNotFull);
	}
}
			
		