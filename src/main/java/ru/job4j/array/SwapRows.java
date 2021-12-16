package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == src) {
                    temp = data[i][j];
                    data[src][j] = data[dst][j];
                    data[dst][j] = temp;
                }
                System.out.println(data[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {3, 2, 1}};
        SwapRows.swap(array, 0, 1);
    }
}
