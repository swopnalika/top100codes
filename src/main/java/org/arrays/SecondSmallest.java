package org.arrays;

public class SecondSmallest {
    public static int small(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];//2nd element because index starts from 0
    }

    public static void main(String args[]) {
        int a[] = {7, 8, 9, 5, 2};
        System.out.println("Second smallest:  " + small(a, 5));
    }
}
