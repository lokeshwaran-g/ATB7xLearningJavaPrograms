package JULY.ex_20072024;

import java.util.Scanner;
import java.lang.System;

public class TriangleClassifier_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("side1");
        int side1 = sc.nextInt();
        System.out.println("side2");
        int side2 = sc.nextInt();
        System.out.println("side3");
        int side3 = sc.nextInt();

        if((side1 == side3) && (side2 == side3))
            System.out.println("It is an Equilateral triangle");
        else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            System.out.println("It is an Isosceles triangle");
        }
        else System.out.println("It is a scalene triangle");
    }

}
