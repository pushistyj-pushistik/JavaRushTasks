package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("JANUARY 1 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStartDate = new Date(date);

        yearStartDate.setDate(1);      // первое число
        yearStartDate.setMonth(0);

        Date currentDate = new Date(date);
        long TimeDistance = currentDate.getTime() - yearStartDate.getTime();
        long Day = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (TimeDistance/Day); //количество целых дней

        return dayCount % 2 == 0 ;
    }
}
