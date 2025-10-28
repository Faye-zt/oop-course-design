package com.coursedesign.demo.a02summation;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        scanner.close();
    }
}
