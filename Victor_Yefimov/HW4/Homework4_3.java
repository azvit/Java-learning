package com.company;

import java.sql.SQLOutput;
import  java.util.Scanner;
public class Homework4_3 {
    public static int index(){
        Scanner in = new Scanner(System.in);
        int s = 0;
        int c=0;
        int[] a = new int[5];
        for(int i=0; i<5; i++){
            System.out.print("a[" + i + "]= ");
            a[i]= in.nextInt();
            System.out.println();
            if (s < a[i]){
                    s = a[i];
                    c = i;
            }

        }
        return c;
    }
    public static void main(String[] args) {
        int x = index();
        System.out.println(x);
    }
}
