package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            int d = Integer.parseInt(reader.readLine());

            int max_1 = a > b ? a : b;
            int max_2 = c > d ? c : d;
            int res = max_1 > max_2 ? max_1 : max_2;
        System.out.println(res);
    }
}
