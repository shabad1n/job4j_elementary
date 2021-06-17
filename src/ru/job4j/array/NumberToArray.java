package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        int com = number;
        int length = 0;
        while (com % 10 > 0) {
            com /= 10;
            length++;
        }
        int[] rslarr = new int[length];
        for (int i = 0; i < rslarr.length; i++) {
            rslarr[i] = number % 10;
            number /= 10;
        }
        return rslarr;
    }

    public static void main(String[] args) {
        int num = 12345;
        NumberToArray.resolve(num);
    }
}
