package org.pattern.pyramid_number;

import java.util.Scanner;

public class NumberPyramid2 {
    public static void main(String[] args)
    {
        int i,j;
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from user

        System.out.print(" Enter the row");
        int row = sc.nextInt();
        //first loop for every new row
        for(i=row;i>=0;i--)
        {
            //second loop to print number in the row
            for(j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
