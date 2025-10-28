package com.coursedesign.demo.a15removeduplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组数字(输入非数字结束)");

        Set<Integer> numberset = new HashSet<>();

        while(sc.hasNextInt()){
            numberset.add(sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>(numberset);

        System.out.println(list);

        sc.close();
    }
}
