package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int temp = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    left[i] = 0;
                    temp++;
                }
            }
        }
        int[] rslarr = new int[left.length - temp];
        temp = 0;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != 0) {
                rslarr[temp] = left[i];
                System.out.println(rslarr[temp]);
                temp++;
            }
        }
        return rslarr;
    }

    public static void main(String[] args) {
        int[] left = new int[]{1, 2, 3, 4, 5};
        int[] right = new int[]{5, 2, 6, 4, 1};
        DiffArray.diff(left, right);
    }
}
