package com.swecourse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int rowList = scanner.nextInt();
        int colList = scanner.nextInt();

        List<List<Integer>> gridList = new LinkedList<>();

        for (int i = 0; i < rowList; i++) {
            List<Integer> newRows = new LinkedList<>();
            for (int j = 0; j < colList; j++) {
                newRows.add(scanner.nextInt());
            }

            gridList.add(newRows);
        }

        // System.out.println(gridList.get(rowList).get(colList));


        for (List<Integer> newRows: gridList) {
            for (int val: newRows) {
                System.out.print("This is the value : " + val + " ");
            }
            System.out.println();
        }
    }
}
