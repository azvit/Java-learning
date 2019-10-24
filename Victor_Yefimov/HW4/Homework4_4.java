package com.company;
import java.util.Scanner;

public class Homework4_4 {
    public static void mas (int m, int n){
        Scanner in = new Scanner(System.in);

        int[][] a = new int[m][n];
        int[] b = new int[m];
        int i, j;
        int m1;
        m1 = 0;
        for (i = 0; i < a.length; i++){
            for(j=0; j < a[i].length; j++){

                a[i][j] = in.nextInt();

            }
            System.out.println();

        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                if (a[i][j] > m1) {
                    m1 = a[i][j];
                }
            }
            System.out.println();
            b[i] = m1;
            m1 = 0;
        }
        System.out.println("_____________________________");
        for (i = 0; i < b.length; i++) {

            System.out.print(b[i] + " ");

        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.print("Input m= ");
	int x = in.nextInt();
        System.out.print("Input n= ");
	int y = in.nextInt();
	mas(x, y);
    }
}
