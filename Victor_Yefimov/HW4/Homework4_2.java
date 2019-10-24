package com.company;

import java.sql.SQLOutput;

public class Homework4_2 {
    public static int multiplication(){
        int s = 0;
        int[] a = new int[10];
        for(int i=0; i<10; i++){
            a[i]= 0 + (int) (Math.random() * 100);
            System.out.println("a[" + i + "]= " + a[i]);
            s = s + a[i];
        }
        return s;
    }
    public static void main(String[] args) {
	int x = multiplication();
        System.out.println(x);
    }
}
