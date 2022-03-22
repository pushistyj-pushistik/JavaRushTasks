package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int counter = 0;
        int counter_2 = 0;

        if (number1 < 0) {
            counter_2++;
        }
        if (number2 < 0) {
            counter_2++;
        }
        if (number3 < 0) {
            counter_2++;
        }
        System.out.println("количество отрицательных чисел: " + counter_2);

        if (number1 > 0) {
            counter++;
        }
        if (number2 > 0) {
            counter++;
        }
        if (number3 > 0) {
            counter++;
        }
        System.out.println("количество положительных чисел: " + counter);
    }
}
