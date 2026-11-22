package com.swecourse;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter the range of the number: ");
        int range = myObj.nextInt();
        int [] number = new int[range];

        for (int i = 0; i < range; i++) {
            System.out.println("Enter the first number in array" + (i + 1) + ": ");
            number[i] = myObj.nextInt();
        }

        int max = number[0];
        for (int j = 0; j < number.length; j++) {
            
                if (number[j] < max) {
                    max = number[j];
                }
        }
        System.out.println("The least element in array: " + max);


    }
}
