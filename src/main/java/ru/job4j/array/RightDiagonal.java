package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] arr = new int[data[0].length];
        for (int i = 0; i < data.length; i++) {
                arr[i] = data[i][data.length - i - 1];
                System.out.println(arr[i]);
            }
        return arr;
        }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RightDiagonal.diagonal(array);
    }
}
