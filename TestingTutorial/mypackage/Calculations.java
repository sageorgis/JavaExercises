
package mypackage;

public class Calculations {
    public int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public double division(int num1, double num2){
        if(num2==0){
            throw new ArithmeticException(num2 + "is 0. Cannot divide by 0!!");
        }
        double division = num1/num2;
        return division;
    }
    
    public int sumOfArray(int [] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    
    //{2,5,10,3} 10== {20,50,100,30}
    public void multiplyArrayByNumber(int [] array, int num){
        for(int i=0;i<array.length;i++){
            array[i]*=num;
        }
    }
}
