package org.nadiaproject;

import java.util.Scanner;

public class JavaStdinStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//is created to read input from the standard input
        int i = scan.nextInt();//This line reads an integer from the input

        // Write your code here.
        double d = scan.nextDouble();//This line reads a double from the input
        scan.nextLine();//method here reads and discards this newline character
        //When you read a number (integer or double) using nextInt()
        // or nextDouble(), it leaves a newline character (\n) in the input buffer.
        String s = scan.nextLine();// this line reads String from the input
        scan.close();//free up the resources


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
