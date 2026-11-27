package com.swecourse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> orderNumber = new LinkedList<>();
            orderNumber.add(3);
            orderNumber.add(4);
            orderNumber.add(-1);
            orderNumber.add(1);

            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            int i = 0;

            for (int n : orderNumber) {
                if (n < min) {
                    min = n;
                    minIndex = i;
                }
                i++;  
            }

            System.out.println(minIndex);  
    }
}
