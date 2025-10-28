package com.coursedesign.demo.a27treesetautosort;

import java.util.Scanner;
import java.util.TreeSet;

public class AutoSortTreeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组数字，输入非数字结束");
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            ts.add(num);
        }
        System.out.println(ts);
        sc.close();
    }
}
