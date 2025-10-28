package com.coursedesign.demo.a09negativenumberexception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Num num = new Num();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("请输入数字");
            int number = sc.nextInt();
            num.setNum(number);

        } catch (NegativeNumberException e) {
            System.out.println("输入的数字不能为负数");
        }
    }
}
