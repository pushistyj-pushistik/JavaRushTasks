package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int x = 1;
            x = 1;
            while (x < 10) {
                System.out.print(x * i + " ");
                x++;
            }
            System.out.println();
            i++;
        }
    }
}
