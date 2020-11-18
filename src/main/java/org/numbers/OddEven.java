package org.numbers;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from the user
        System.out.print("Enter a Number : ");
        int numb = sc.nextInt();
        //condition for even
        if (numb % 2 == 0)
            System.out.println("Even Number");
            //condition for odd
        else
            System.out.println("Odd Number");

    }

}
