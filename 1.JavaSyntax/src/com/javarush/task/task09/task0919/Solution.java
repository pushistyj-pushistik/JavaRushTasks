package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
        divideByZero();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void divideByZero(){
        int n = 10 / 0;
        System.out.println(n);
    }
}
