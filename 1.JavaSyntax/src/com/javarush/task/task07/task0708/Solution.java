package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int max = 0;
        int inx = 0;
        for (int i = 0; i < 5; i++) {
         strings.add(reader.readLine());
        if (strings.get(i).length() >= max) {
            inx = i;
            max = strings.get(i).length();
        }
        }
        System.out.println(strings.get(inx));




    }
}
