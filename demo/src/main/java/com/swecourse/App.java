package com.swecourse;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter first number: ");

        System.out.println("Enter the second number: ");

        int myFirstNumber = myObj.nextInt();
        int mySecondNumber = myObj.nextInt();

        for(int i = 0; i <= mySecondNumber; i++) {
            myFirstNumber = i;
            if ( i != mySecondNumber) {
                myFirstNumber++;
                 if (i %2== 0) {
                    System.out.println("The even numbers in: " + i);
                 }
            }
        }

    }
}
