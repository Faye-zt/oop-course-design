package com.coursedesign.demo.a06SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====简单计算器=====");
        System.out.println("支持的运算: +, -, *, /");

        try {

            System.out.println("请输入第一个数字:");
            double num1 = scanner.nextDouble();

            System.out.println("请输入运算符 (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            System.out.println("请输入第二个数字:");
            double num2 = scanner.nextDouble();

            double result = calculate(num1, num2, operator);

            System.out.println("结果：" + result);
        } catch (Exception e){
            System.out.println("请输入正确的数字和运算符！");
        }finally {
            scanner.close();
        }

    }

    public static double calculate(double num1, double num2, char operator){
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if(num2 == 0){
                    System.out.println("除数不能为零！");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("不支持的运算符: " + operator);
        }
    }
}
