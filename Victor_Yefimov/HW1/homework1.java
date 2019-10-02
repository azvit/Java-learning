package com.company;
import java.util.Scanner;
public class homework1 {

    public static void main(String[] args) {
        System.out.println("Задача 3");
	 System.out.println("Ефимов");
	 System.out.println("Виктор");

        System.out.println("Задача 4 и 7");
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        in.close();


    }
}
