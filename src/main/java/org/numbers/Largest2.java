package org.numbers;

import java.util.Scanner;

public class Largest2 {
    public static void main(String[] args) {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input first number
        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
        //input second number
        System.out.print("Enter the second number : ");
        int second = sc.nextInt();
        //conditions
        if (first > second)
            System.out.println(first + " is greater than " + second);
        else if (second > first)
            System.out.println(second + " is greater than " + first);
        else
            System.out.println("Both numbers are Equal");


    }
}
