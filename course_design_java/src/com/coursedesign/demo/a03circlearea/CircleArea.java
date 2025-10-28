package com.coursedesign.demo.a03circlearea;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入圆的半径");
        Double radius = scanner.nextDouble();

        Double area = Math.PI*radius*radius;

        System.out.println("半径为" + radius + "的圆的面积为" + area);

        scanner.close();

    }
}
