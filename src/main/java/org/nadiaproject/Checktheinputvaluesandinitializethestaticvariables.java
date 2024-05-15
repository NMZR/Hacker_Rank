package org.nadiaproject;

import java.util.Scanner;

public class Checktheinputvaluesandinitializethestaticvariables {
    static int B; // Static variable
    static int H; // Static veriable? =
    static boolean flag = true; // is a static boolean variable that will
    // be used to determine if the input values are valid

    static { /// Static Initialization Block

        ///The static block is executed when the class is loaded
        //A Scanner object is created to read the input values
        //The values for B and H are read from the input
        //If either B or H is less than or equal to zero flag is set to false and an exception message is printed
        //The scanner is closed after reading the input values
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
        //// The main method checks the flag variable.
        //If flag is true it calculates the area of the parallelogram (B * H) and prints the result.
        //If flag is false the exception message has already been printed by the static block and no further action is needed.
    }
}
