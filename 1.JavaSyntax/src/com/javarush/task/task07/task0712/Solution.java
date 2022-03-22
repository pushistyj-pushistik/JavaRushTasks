package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int max = list.get(0).length();
        int min = list.get(0).length();
        int imin = 0;
        int imax = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                imin = i;
                min = list.get(i).length();
            }

            if (list.get(i).length() > max) {
                imax = i;
                max = list.get(i).length();
            }
        }
        if (imin < imax) System.out.println(list.get(imin));
        else System.out.println(list.get(imax));

    }
}
