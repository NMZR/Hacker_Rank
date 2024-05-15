package org.nadiaproject;

import java.util.Scanner;

public class HashNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while (scanner.hasNext()) {///loop is used with scanner.hasNext() to check if there is another line of input.
            // This method returns true if there is another line of input, otherwise it returns false.
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        scanner.close();
    }
}
