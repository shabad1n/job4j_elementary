package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int temp = 0;
        int[] arr = new int[data.length * data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                arr[temp] = data[i][j];
                System.out.println(arr[temp]);
                temp++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MergeRows.merge(array);
    }
}
