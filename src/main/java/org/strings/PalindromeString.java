package org.strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev = rev + s.charAt(i);
        if (s.equals(rev))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }
}
