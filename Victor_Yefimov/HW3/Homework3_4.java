package com.company;
import java.util.Scanner;
import java.util.Random;
public class Homework3_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int[] a = new int[10];
        System.out.print("Input p= ");
        int p = in.nextInt();
        System.out.println();
        int i;
        int n;
        int x = 1000;
        for (i=0; i < a.length; i++){
            n = rand.nextInt(p);
            a[i]=n;
            System.out.println("a["+ i + "]= " + a[i]);
            if (a[i]<x){
                x=a[i];
            }
        }
        System.out.println("наименьшее число - это х= "+ x);
    }
}
