package org.example;

import org.testng.annotations.Test;

public class Calculator {

    public static void main(String[] args) {
     //   System.out.println("\u001B[32mResult: \u001B[0m"+ calculateAverage(1,2));
        System.out.println("My next line");
    }

    @Test
    public void name(){
        System.out.println("RES : "+ calculateAverage(1,2,3,4));
    }
    public double calculateAverage(int...numbers){
        if(numbers.length==0){
            throw new IllegalArgumentException("Array numbers cannot be empty!");}
        int sum=0;
        for (int num : numbers){
            sum+=num;
        }
        return (double) sum/ numbers.length;
    }
}
