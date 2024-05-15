package org.nadiaproject;

import java.security.Permission;
import java.util.Scanner;

public class ChangingIntToString {

        public static void main(String[] args) {


                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                in.close();
                //String s=???; Complete this line below
                String s = String.valueOf(n); // chanhging the int to string by using String.Valueof method.
                //Write your code here

                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                        System.out.println("Wrong answer.");
                }
        }}