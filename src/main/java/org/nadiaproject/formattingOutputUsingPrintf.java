package org.nadiaproject;

import java.util.Scanner;

public class formattingOutputUsingPrintf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
        sc.close();

    }
}
/// comments:
///The for loop iterates 3 times to read 3 lines of input.
//String str = scanner.next(); reads the next string token.
//int num = scanner.nextInt(); reads the next integer token.
//System.out.printf("%-15s%03d%n", str, num); prints the string and integer in the specified format:
//% starts the format specifier.
//-15s means the string (s) is left-justified and takes up 15 characters.
//03d means the integer (d) is padded with leading zeros to be 3 digits wide.
//%n prints a newline character.