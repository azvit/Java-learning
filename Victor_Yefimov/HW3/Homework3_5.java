package com.company;
import java.util.Scanner;
import java.util.Random;
public class Homework3_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int[][] a = new int[2][3];
        int[] b = new int[2];
        System.out.print("Input p= ");
        int p = in.nextInt();
        System.out.println();
        int i, j;
        int n, m;
        m = 0;
        for (i = 0; i < a.length; i++){
            for(j=0; j < a[i].length; j++){
                n = rand.nextInt(p);
                a[i][j] = n;
                System.out.printf("%d ", a[i][j]);
                m=m+ a[i][j];
            }
            System.out.println();
            b[i] = m;
        }
        System.out.println();
        for (i=0; i< a.length; i++){
            System.out.println("b["+i+"]=" + b[i]);
        }

    }
}
