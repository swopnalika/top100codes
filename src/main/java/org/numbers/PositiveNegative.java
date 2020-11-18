package org.numbers;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //input from the user
        System.out.print("Enter a Number : ");
        int numb = sc.nextInt();
        //condition for positive
        if (numb > 0)
            System.out.println("Positive");
        //condition for negative
        else if (numb < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

    }
}
