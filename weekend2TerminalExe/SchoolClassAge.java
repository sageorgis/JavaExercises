public class SchoolClassAge{
	
	public static void main(String [] args){
		
		int age = Integer.parseInt(args[0]);

		if(age>=5 && age<=12){
			System.out.println("You are going in primary education school");
		}else if(age>=13 && age<=15){
			System.out.println("You are going in secondary education school");
		}else if(age<=18){
			System.out.println("You are going in upper secondary education school");
		}else{
			System.out.println("You are not going in any level of school.");
		}
	}
}