package classexercise1;

import java.util.Scanner;

 //@author Nikos Sageorgis
 
import java.util.Locale;
public class ClassExercise1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("What's your name?");
        String myName = input.next();
        System.out.println("What's your gender?");
        String myGender = input.next();
        int myAge = ageValidation(input);
        if(myAge==0){
            System.exit(0);
        }
        favoriteSeason(input);
        weightHeight(input);
        String luckyD = luckyDay(myAge); 
        clubVisit(luckyD, myName, myAge, myGender);
    }
    
    static int ageValidation(Scanner input){
        System.out.println("How old are you?");
        int myAge = input.nextInt();
        int temp;
        if (myAge<=5 && myAge>0){
            System.out.print("You are too young for this app. ");
            temp = 6 - myAge;
            System.out.println("Come back in "+ temp + "years when you will be a student");
            temp = myAge + 20;
            System.out.println("You weren't borned in 1980 but in 2040 you will be " + temp + " years old");
            return 0;
        }else if (myAge>=6 && myAge<=18){
            System.out.print("Oh, you are a student. ");
            temp = 19 - myAge;
            System.out.println("Keep up... "+ temp + " more years left and afterwards you will make money");
            temp = myAge + 20;
            System.out.println("You weren't borned in 1980 but in 2040 you will be " + temp + " years old");
        }else if (myAge>=19 && myAge<=40){
            System.out.print("Well, you must be employed. ");
            temp = myAge - 18;
            System.out.println("You finished school " + temp + " years ago.");
            temp = myAge + 20;
            if(myAge<=39){
                System.out.println("You weren't borned in 1980 but in 2040 you will be " + temp + " years old");
            }else{
                System.out.println("You borned in 1980 and in 2040 you will be " + temp + " years old");
            }
        }else if(myAge>40){
            temp = myAge + 20;
            System.out.println("In 1980 you were " + (myAge - 40) + " years old and in 2040 you will be " + temp + " years old");
            System.out.println("You are too old for this app.");
            return 0;
        }else{
            System.out.println("You give a wrong number.");
            return 0;
        }
        return myAge;     
    }
    static void favoriteSeason(Scanner input){
        int num;
        String [] array = {"Winter","Spring", "Summer", "Autumn"};
        System.out.println("Choose one between 1-4 of the following answers for your favorite season: " );
        for(int i=0; i<array.length; i++){
            System.out.println((i+1) + array[i]);
        }
        num = input.nextInt();
        if (num == 1){
            System.out.println("It must be cold outside.");
        }else if (num == 2){
            System.out.println("Ohh, flowers are very beautiful these days");
        }else if (num == 3 ){
            System.out.println("Let's go for swimming.");
        }else if (num ==4){
            System.out.println("The trees are full of brown leaves");
        }else{
            System.out.println("Wrong Number");
        }
    }
    
    static void weightHeight(Scanner input){
        int weight;
        double height;
        double bmi;
        System.out.print("Enter your weight: ");
        weight = input.nextInt();
        System.out.print("Enter your height: ");
        height = input.nextDouble();
        bmi = weight/(height*height);
        if (bmi<18.5){
            System.out.println("You are undreweight.");
        }else if (bmi>=18.5 && bmi<=24.9){
            System.out.println("You have normal weight.");
        }else if (bmi>=25 && bmi<=29.9){
            System.out.println("You are overweight.");
        }else{
            System.out.println("You have obesity.");
        }
    }
    
    static String luckyDay(int age){
        int myAge = age*365;
        int sum=0;
        int temp =myAge;
        String [] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        while (temp > 0) {
            myAge = myAge % 10;
            sum+=myAge;
            temp = temp / 10;
            myAge = temp;
        }
        if (sum>6){
            System.out.println("Your lucky day is " + array[sum%7]);
            return array[sum%7];
        }else{
            System.out.println("Your lucky day is " + array[sum]);
            return array[sum];
        }
    }
    
    static void clubVisit(String day, String name, int age, String gender){
        Scanner married = new Scanner(System.in);
        if (day.equals("Wednesday")&& age>=20 && age<=40){
            if(age>=20 && age<=25){
                System.out.println("Welcome, " + name);
            }else if(age>25 && gender.equals("M") || gender.equals("m")){
                System.out.println("Welcome Mr. " + name);
            }else if(age>25 && gender.equals("F") || gender.equals("m")){
                System.out.println("Are you married?");
                if(married.next().equals("yes")){
                    System.out.println("Welcome Mrs. " + name);
                }else{
                    System.out.println("Welcome Ms. " + name);
                }
            }
        }else{
            System.out.println("You are not allowed to entry.");
        }
            
        
    }
}
    
   
