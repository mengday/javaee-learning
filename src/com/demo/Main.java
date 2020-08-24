package com.demo;

public class Main {

    public static void main(String[] args) {
        int result = div(10, 5);
        System.out.println(result);
    }

    public static int div(int num, int num2) {
        if (num2 != 0) {
            return num / num2;
        } else {
            System.out.println("num2 不能为0");
            return 0;
        }
    }
}
