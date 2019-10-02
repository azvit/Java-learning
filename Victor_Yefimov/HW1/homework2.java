package com.company;
import java.util.Scanner;
public class homework2 {

    public static void main(String[] args) {
        System.out.println("Задача 5");
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name: ");
        String firstName = in.nextLine();
        System.out.print("Input Surname: ");
        String secondName = in.nextLine();
        System.out.print("Input phone number: ");
        String phoneNumber = in.nextLine();
        System.out.print("Input place of study/work: ");
        String workPlace = in.nextLine();
        System.out.printf("\nName:\t\t\t %s\nSurname:\t\t %s\nPhone number:\t %s\nWork place: \t %s\n", firstName, secondName, phoneNumber, workPlace);
        in.close();
        System.out.println("Задача 6");
        float a = 5, b = 3f, h = 3.5f;// a - довжина, b - ширина, h - висота
        float V = a * b * h;

        System.out.println(V);
    }
}
