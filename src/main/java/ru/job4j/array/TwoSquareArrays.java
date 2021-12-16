package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] arr = new int[left.length * right.length];
        int temp = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                arr[temp] = (left[i][j] >= right[i][j]) ? left[i][j] : right[i][j];
                System.out.println(arr[temp]);
                temp++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] left = {{1, 11}, {21, 31}, {41, 42}};
        int[][] right = {{2, 10}, {11, 41}, {41, 44}};
        TwoSquareArrays.collectArray(left, right);
    }
}
