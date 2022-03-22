package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;

        while (x <= 10) {
            int i = 1;
            while (i <= 10) {
                System.out.print("S");
                i++;
            }
            System.out.println();
            x++;
        }
    }
}