/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Nikos
 */
public class CalculationsTest {
    private Calculations calc;
    
    public CalculationsTest() {
    }
    
    
    @Before//runs before each test case
    public void setUp() {
         calc = new Calculations();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSum method, of class Calculations.
     */
    @Test//test case
    public void testGetSumValid() {
        
        int result = calc.getSum(2, 2);
        assertEquals(4, result);
    }
    
     @Test//test case
    public void testGetSumNotValid() {
        
        int result = calc.getSum(2, 2);
        assertNotEquals(5, result);
    }
    
     @Test
    public void testDivisionValid(){
        
        double result= calc.division(4, 2);
         assertEquals(2, result, 0.1);
    }
    
     @Test(expected = ArithmeticException.class)
    public void testDivisionZeroNumber(){
        calc.division(4, 0);
    }
    
     @Test
    public void testDivisionNegativeNumber(){
       
        double result = calc.division(-4, 2);
        assertTrue(result<0);
    }
    
     @Test
    public void testDivisionPositiveNumber(){
       
        double result = calc.division(-4, -2);
        assertFalse(result<0);
    }
    
     @Test
    public void testSumOfArrayValid(){
        
        int [] array = {2,4,8};
        int sum = calc.sumOfArray(array);
         assertEquals(14, sum);
    }
    
      @Test
    public void testSumOfArrayNotValid(){
       
        int [] array = {2,4,8};
        int sum = calc.sumOfArray(array);
         assertNotEquals(20, sum);
    }
    
     @Test
    public void testMultiplyArrayByNumberValid(){
       
        int [] array = {2,5,10,3};
        int num = 10;
        calc.multiplyArrayByNumber(array, num);
        int [] expected = {20, 50, 100, 30};
        for(int i =0; i<array.length;i++){
            System.out.println(array[i]+ " ");
        }
        assertArrayEquals(expected, array);
    }
}
