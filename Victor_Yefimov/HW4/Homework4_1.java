package com.company;
import java.util.Scanner;
public class Homework4_1 {
    public static void printTable (int x, int y){
        int a, b, c;
        for(a=x; a> 0; a--){
        for(b=y; b > 0; b--){
            c = a*b;
            System.out.print(c + " ");
            if (c < 10){
                System.out.print(" ");
            }
            if (b == 1){
                System.out.println("");
            }
        }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    System.out.println("Input x=");
        int d = in.nextInt();
        System.out.println("Input y=");
        int f = in.nextInt();
        printTable(d,f);
    }
}
