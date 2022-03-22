package com.go.little.rockstar;

class Solution {
    public int pivotIndex(int[] array) {
        int [] array1 = {1, 5, 4, 3, 7};
        int total = 0, sum = 0;
        for (int num : array1) total += num;
        for (int i = 0; i < array1.length; sum += array1[i++])
            if (sum * 2 == total - array1[i]) return i;
        return -1;
    }
}