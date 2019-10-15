package com.company;


 import java.util.Scanner;
public class Homework3_2 {

    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c;
        int d;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a= ");
        int n = in.nextInt();
        System.out.println();
        System.out.print("Input b= ");
        int m = in.nextInt();
        System.out.println();
        System.out.print("  ");
        for (b=1; b<m+1; b++){
            System.out.print(b + "  ");
        }
        System.out.println();
        for (a=1; a<n+1; a++) {
            System.out.print(a + " ");
            for (b=1; b<m+1; b++) {
                c = a*b;
                System.out.print(c + " ");
                if (c<10) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
