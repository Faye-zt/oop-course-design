package com.coursedesign.demo.a15removeduplicates;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 一组数字");
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            int flag = 0;
            for (Integer integer : list) {
                if (num == integer) {
                    flag = 1;
                }
            }
            if(flag == 0){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
