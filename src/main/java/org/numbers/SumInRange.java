package org.numbers;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.print("Enter starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter ending number : ");
        int end = sc.nextInt();
        //declare a variable to store sum
        int sum = 0;
        //loop to add n natural numbers
        for (int i = start; i <= end; i++)
            sum = sum + i;
        //display the sum
        System.out.print("Sum of numbers in the range from " + start + " to " + end + " is " + sum);
    }
}
