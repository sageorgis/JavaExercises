import java.util.Scanner;
import java.util.Random;


public class StudentClass{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		//String [] classStructureLastRow = new String [students];
		String name;
		int rows, students;
		System.out.println("Give the number of rows:");
		rows = input.nextInt();
		System.out.println("Give the number of students:");
		students = input.nextInt();
		/*int seatsByRow = students/rows+1;
		/*(if (seatsByRow<=0){
			seatsByRow = rows/students+1;
		}*/
		int seats = rows*students;
		String [][] classStructure = new String [rows][students];
	
		do{
		int r = random.nextInt(rows);
		int s = random.nextInt(students);
		
		
			
		if (classStructure[r][s]==null){
			System.out.println(seats + " seats are empty!");
			System.out.printf("Please enter student's name for seat [%d][%d]\n",r,s );
			classStructure[r][s] = input.next();
			seats--;
		}
		/*if (classStructureLastRow[students].equals("null")&& r==rows){
			System.out.println(students-i + " seats are empty!");
			System.out.println("Please enter student's name for seat " + classStructureLastRow[s]);
			i++;
		}*/
		}while(0!=seats);
		System.out.println("Thank you, all seats were filled.");
		for (int i=0;i<classStructure.length; i++){
			for(int j=0; j<classStructure[i].length;j++){
				System.out.printf(classStructure[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}
		