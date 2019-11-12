package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String choice;
        R2D2 r2d2 = new R2D2();

    r2d2.setName("R2D2-S1");
    r2d2.setWeight(95);
    System.out.printf("\tName:%s Weight:%d\n",r2d2.getName(), r2d2.getWeight()) ;
        System.out.println(" Выход, для завершения работы программы");
        r2d2.move();
        while (!r2d2.getLoc().equals("Выход")) {
            r2d2.move();
        }
    }
}
