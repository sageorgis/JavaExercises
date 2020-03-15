public class SeasonMonth{
	
	public static void main(String [] args){

		String month = args[0];
		String [][] season = {{"Autumn", "September", "October", "November"}, {"Winter", "December", "January", "February"}, {"Spring", "March", "April", "May"}, {"Summer", "June", "July", "August"}};
		
		for(int i=0; i<season.length;i++){
			for(int j=1; j<season[i].length;j++){
				if (season[i][j].equals(month)){
					System.out.println("The season that according to " + month + " is " + season[i][0]);
				}
			}
			
		}
		
	}
}
