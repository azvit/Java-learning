package com.company;
import java.util.Scanner;
public class Homework3_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print ("Input A= ");
        int a = in.nextInt();
        System.out.println();
        System.out.print("Input B= ");
        int b = in.nextInt();
        int c = (a*b)/2;
        System.out.println("Квадрат прямоугольного треугольника равен S= " + c);
        in.close();
    }
}
