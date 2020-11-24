package org.pattern.pyramid_number;

import java.util.Scanner;

public class NumberPyramid1 {
    public static void main(String[] args) {

        int i, j;
        //Scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.print(" Enter the row");
        int row = sc.nextInt();
        //first loop for the row
        for (i = 1; i <= row; i++) {
            //second loop for print element in the row
            for (j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
