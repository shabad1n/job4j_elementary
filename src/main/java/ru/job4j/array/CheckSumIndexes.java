package ru.job4j.array;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int indexsum = 0;
        int lengthrslarr = 0;
        int collrslarray = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (sum == indexsum) {
                    data[i][j] = 0;
                }
                if (data[i][j] != 0) {
                    lengthrslarr++;
                }
                indexsum++;
            }
            indexsum = i + 1;
        }
        int[] arr = new int[lengthrslarr];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0 && collrslarray < lengthrslarr) {
                    arr[collrslarray] = data[i][j];
                    System.out.println(arr[collrslarray]);
                    collrslarray++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        CheckSumIndexes.collectNewArray(array, 2);
    }
}
