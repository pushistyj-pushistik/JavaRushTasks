package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] stringToArray = string.toCharArray(); // Преобразуем строку string в массив символов (char)
        // Вывод массива на экран
        for(int i = 0; i < stringToArray.length; i++) {
            if (i == 0) {
                stringToArray[i] = Character.toUpperCase(stringToArray[i]);
            }
            if (stringToArray[i] == ' ') {
                stringToArray[i + 1] = Character.toUpperCase(stringToArray[i + 1]);
            }

        }
        System.out.print(stringToArray);
    }
}
