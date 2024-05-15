package org.nadiaproject;

import java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N % 2 != 0) {/// If  is odd, print Weird
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) { //If  is even and in the inclusive range of  to , print Not Weird
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {//If  is even and in the inclusive range of  to , print Weird
                System.out.println("Weird");
            } else if (N > 20) {//If  is even and greater than , print Not Weird
                System.out.println("Not Weird");
            }
        }
    }
}