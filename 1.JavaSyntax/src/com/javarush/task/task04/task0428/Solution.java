package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        boolean d = (a > 0);
        boolean e = (b > 0);
        boolean f = (c > 0);
        if (d && e && f) {
            System.out.println(3);
        } else if (d && e || d && f || e && f) {
            System.out.println(2);
        } else if (d || e || f) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
