package com.coursedesign.demo.a07bank;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====银行账户管理系统====");

        BankAccount account = new BankAccount(1000.0);

        account.checkBalance();

        boolean running = true;

        while(running){
            System.out.println("\n请选择操作");
            System.out.println("1. 存款");
            System.out.println("2. 取款");
            System.out.println("3. 查询余额");
            System.out.println("4. 退出");
            System.out.print("请输入您的选择：");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("请输入存款金额：");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("请输入取款金额：");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    running = false;
                    System.out.println("感谢使用银行管理系统！");
                    break;

                default:
                    System.out.println("无效的选择，请重新输入！");
            }
        }

        scanner.close();

    }
}
