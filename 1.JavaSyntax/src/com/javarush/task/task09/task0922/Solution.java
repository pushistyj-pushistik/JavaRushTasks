package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter2 = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Date date = formatter.parse(reader.readLine());
        System.out.println(formatter2.format(date).toUpperCase());
    }
}
