package org.numbers;

import java.util.*;

class SumNumbers {
    public static void main(String[] aa) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        System.out.println("Sum is " + sum);

    }
}

