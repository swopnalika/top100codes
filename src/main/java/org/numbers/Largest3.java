package org.numbers;

import java.util.Scanner;

public class Largest3 {

    public static void main(String[] args) {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input three numbers from user
        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Enter the second number : ");
        int second = sc.nextInt();
        System.out.print("Enter the third number : ");
        int third = sc.nextInt();
        System.out.println();
        //condition for first number
        if (first > second && first > third)
            System.out.println(first + " is the greatest number.");
            //condition for second number
        else if (second > first && second > third)
            System.out.println(second + " is the greatest number.");
            //condition for third number
        else if (third > first && third > second)
            System.out.println(third + " is the greatest number.");
            //condition when all three numbers are equal
        else
            System.out.println("All three numbers are same");

    }
}
