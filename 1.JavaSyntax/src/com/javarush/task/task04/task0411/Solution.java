package com.javarush.task.task04.task0411;

/* 
Время года
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (month < 3 || month == 12) {
            System.out.println("зима");
        } else if (month < 6) {
            System.out.println("весна");//напишите тут ваш код
        } else if (month < 9) {
            System.out.println("лето");
        } else {
            System.out.println("осень");
        }
    }
}