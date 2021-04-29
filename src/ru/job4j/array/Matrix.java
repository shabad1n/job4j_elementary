package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        int i = 1;
        for (int row = 0; row < size; row++) {
            int j = 1;
            for (int cell = 0; cell < size; cell++) {
               array[row][cell] = i * j;
                System.out.println(array[row][cell]);
                j++;
            }
            i++;
        }
        return  array;
    }

    public static void main(String[] args) {
        Matrix.multiple(9);
    }
}
