package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        if (((t % 5) >= 0) && ((t % 5) < 3)) {
            System.out.println("зелёный");
        } else if (((t % 5) >= 3) && ((t % 5) < 4)) {
            System.out.println("желтый");
        } else
        System.out.println("красный");

    }
}