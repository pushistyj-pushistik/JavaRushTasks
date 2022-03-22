package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array1 = new String[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            String s = reader.readLine();
            array1[i] = s;
            array2[i] = s.length();
        }

        for (int j = 0; j < array1.length; j++) {
                System.out.println(array2[j]);
            }

        }
    }

