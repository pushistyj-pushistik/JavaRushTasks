package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] big_one = new int[20];
        int[] small_one = new int[10];
        int[] small_two = new int[10];

        for (int i = 0; i < big_one.length; i++) {
            big_one[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < big_one.length/2; i++) {
            small_one[i] = big_one[i];
        }
        for (int i = 10; i < big_one.length; i++) {
            small_two[i-10] = big_one[i];
            System.out.println(small_two[i-10]);
        }
    }
}
