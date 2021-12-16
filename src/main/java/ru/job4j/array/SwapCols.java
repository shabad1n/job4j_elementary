package ru.job4j.array;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
                temp = data[i][src];
                data[i][src] = data[i][dst];
                data[i][dst] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SwapCols.swap(array, 0, 2);
    }
}