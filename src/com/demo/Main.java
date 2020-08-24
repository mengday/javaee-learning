package com.demo;

public class Main {

    public static void main(String[] args) {
        int result = div(10, 5);
        System.out.println(result);
    }

    public static int div(int num, int num2) {
        if(num2 == 0) {
            System.out.println("除法分母不能为0");
        } else {
            return num / num2;
        }
    }
}
