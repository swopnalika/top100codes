package org.pattern;

import java.util.Scanner;

public class DiamondStar {

    public static void  main(String[] args)
    {
        //scanner class declaration
        Scanner sc=new Scanner(System.in);
        //taking user input
        System.out.print("Enter the number of row ");
        int n=sc.nextInt();
        //declare for loop for print first pyramid
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //declare for loop for print reverse pyramid
        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
