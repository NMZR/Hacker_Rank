package org.nadiaproject;

import java.util.Scanner;

public class CreatingIntegersSeries {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){/// process each query of integers
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a, b, n);/// calling the method

        }
        in.close();
    }
    public static void printSeries(int a, int b, int n) {/// method generates the series
        int cv = a; // current value
        for (int j = 0; j < n; j++) {///calculate each term in the series
            cv += Math.pow(2, j) * b;
            System.out.print(cv + " ");
        }
        System.out.println();
    }
}

