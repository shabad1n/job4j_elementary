package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        double lengtharr = Math.sqrt(array.length);
        int com = (int)  Math.ceil(lengtharr);
        int[][] arr = new int[com][com];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (temp < array.length) {
                    arr[i][j] = array[temp];
                    temp++;
                    System.out.println(arr[i][j]);
                } else {
                    arr[i][j] = 0;
                    System.out.println(arr[i][j]);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        ArrayInSquareArray.convertArray(array);
    }
}
