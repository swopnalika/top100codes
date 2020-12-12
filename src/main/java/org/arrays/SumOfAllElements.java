package org.arrays;

import java.util.Scanner;

public class SumOfAllElements {
    public static int sum(int[] arr, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size ");
        int size = sc.nextInt();
        System.out.println("enter Element");
        for (int i = 0; i < size; i++)
            a[i] = sc.nextInt();
        System.out.println("sum: " + sum(a, size));
    }
}
