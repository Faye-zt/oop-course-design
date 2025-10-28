package com.coursedesign.demo.a14findmax;

public class Test {
    public static void main(String[] args) {
       FindMax find = new FindMax();
        String max = find.findMax(new String[]{"aaa", "bbb", "ccc", "ddd", "eee"});
        //Integer max = find.findMax(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(max);
    }
}
