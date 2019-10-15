package com.company;
import java.util.Scanner;
 import java.util.Random;
public class Homework3_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int[] a = new int[10];
        System.out.println("Input p= ");
        int p = in.nextInt();
        System.out.println();
        int i;
        int n;

        for (i=0; i < a.length; i++){
            n = rand.nextInt(p/2);
            a[i]=n;
            System.out.println("a["+ i + "]= " + a[i]);
        }
    }
}
