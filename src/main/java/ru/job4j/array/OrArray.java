package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int  lengthrslarr = 0;
        int k = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    lengthrslarr++;
                }
            }
        }
        int[] rslarr =  Arrays.copyOf(left, left.length + right.length - lengthrslarr);
        lengthrslarr = left.length;
        for (int i = 0; i < right.length; i++) {
            if (right[i] != rslarr[k]) {
                rslarr[lengthrslarr++] = right[i];
                k++;
            } else {
                k++;
            }
        }
        for (int i = 0; i < rslarr.length; i++) {
                System.out.println(rslarr[i]);
            }
        return rslarr;
    }

    public static void main(String[] args) {
        int[] left = new int[]{1, 2};
        int[] right = new int[]{1, 2, 3, 4};
        OrArray.or(left, right);
        }
}
