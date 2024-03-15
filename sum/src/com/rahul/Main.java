package com.rahul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the value of a: ");
        int a = in.nextInt();
        System.out.print("enter  the value of b: ");
        int b = in.nextInt();
        int c = a + b;

        System.out.println("sum of a and b is :" + c);
    }
}
