package tests;

import helpers.RetryAnalyzer;
import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testCalculatorPositiveNumbers(){
        Calculator calculator = new Calculator();
        double result = calculator.calculateAverage(1,2,3);
        Assert.assertEquals(result, 2.0);
    }
    @Test
    public void testMixedNumbers(){
        Calculator calculator = new Calculator();
        double result = calculator.calculateAverage(1,-2,3,-4,5);
        System.out.println("Result: "+result);
        Assert.assertEquals(result, 0.6);
    }
    @Test
    public void testSingleNumber(){
        Calculator calculator = new Calculator();
        double result = calculator.calculateAverage(10);
        System.out.println("Result: "+result);
        Assert.assertEquals(result, 10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            retryAnalyzer = RetryAnalyzer.class)
    public void testEmptyNumbers(){
        Calculator calculator = new Calculator();
        double result = calculator.calculateAverage();
        System.out.println("Result: "+result);
    }




}
