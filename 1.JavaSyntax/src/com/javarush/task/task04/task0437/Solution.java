package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        for (int n = 1; n < 11; n++) {
            for (int m = 0; m < n; m++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
