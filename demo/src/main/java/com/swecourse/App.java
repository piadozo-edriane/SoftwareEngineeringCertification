package com.swecourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        List<Integer> responseTimes = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the range of the link list: ");
        int range = myObj.nextInt();


        for (int i = 0; i <= range; i++ ) {
            int inputNumber = myObj.nextInt();
            responseTimes.add(inputNumber);
        }
        
        for (int n: responseTimes) {
            System.out.println(n);
        }
    }
}
