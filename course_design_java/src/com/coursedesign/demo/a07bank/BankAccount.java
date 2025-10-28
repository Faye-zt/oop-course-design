package com.coursedesign.demo.a07bank;

public class BankAccount {
    private Double balance;

    //获取余额
    public Double getBalance() {
        return balance;
    }

    //初始化账户
    public BankAccount(double initialBalance){
        if(initialBalance < 0){
            this.balance = 0.0;
            System.out.println("初始余额不能为负数，已设为0");
        }else {
            this.balance = initialBalance;
        }
    }

    //存款方法
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("存款金额不能为负数");
            return;
        }
        this.balance += amount;
        System.out.println("存款成功！存入：" + amount + "元" );
        System.out.println("当前余额为：" + balance);
    }

    //取款方法
    public void withdraw(double amount){
        if(amount < 0){
            System.out.println("取款金额不能为负数");
            return;
        }
        if(amount > balance){
            System.out.println("余额不足！当前余额为" + balance + "元");
            return;
        }
        this.balance -= amount;
        System.out.println("取款成功！取出：" + amount + "元" );
        System.out.println("当前余额为：" + balance);
    }

    public void checkBalance(){
        System.out.println("当前余额为：" + balance);
    }



}
