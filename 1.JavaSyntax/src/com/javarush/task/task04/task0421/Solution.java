package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name_one = reader.readLine();
            int len1 = name_one.length();
            String name_two = reader.readLine();
            int len2 = name_two.length();

            if (name_one.equals(name_two))
                System.out.println("Имена идентичны");
            else if (len1 == len2 )
                System.out.println("Длины имен равны");
    }
}
