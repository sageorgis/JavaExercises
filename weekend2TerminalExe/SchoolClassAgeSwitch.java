public class SchoolClassAgeSwitch{

	public static void main(String [] args){
		
		int age = Integer.parseInt(args[0]);
		switch(age){
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println("You are going in primary education school.");
				break;
			case 13:
			case 14:
			case 15:
				System.out.println("You are going in secondary education school.");			break;
			case 16:
			case 17:
			case 18:
				System.out.println("You are going in upper secondary school.");
				break;
			default:
				System.out.println("You are not going in any level of school.");
		}
	}
}