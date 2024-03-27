package org.example;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {

        System.out.println("My string : "+generateRandomString(25));
    }

    public static String generateRandomString(int length ){
        if(length<=0){throw new IllegalArgumentException();}
        String characters =
                "zxcvbnnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLPOIUYTREWQ1234567890";
        StringBuilder stringBuilder =new StringBuilder();
        SecureRandom random = new SecureRandom();
        for (int i =0; i<length; i++){
            int randomIndex = random.nextInt(characters.length());
            stringBuilder.append(characters.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }

    public static void arrayListTest(){

        ArrayList<Integer> names = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i=0; i< 10000; i++){
            names.add(i);
        }
            long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println("ArrayList Time : "+duration);
    }

    public  static void linkedListTest(){
        LinkedList<Integer> list = new LinkedList<>();
        long startTime = System.nanoTime();
        for (int i=0; i< 10000; i++){
            list.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println("LinkedList Time: "+duration);
    }
}
