package com.coursedesign.demo.a04multiplicationtable;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d*%d=%-4d", j, i, i * j);
            }
            System.out.println();
        }
    }
}
