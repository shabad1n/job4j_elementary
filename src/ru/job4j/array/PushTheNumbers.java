package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int temp = array[row][column];
        int com = 0;
        array[row][column] = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == row + 1 && j == column) || (i == row - 1 && j == column)) {
                    com = array[i][j];
                    array[i][j] = array[i][j - 1];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == row + 1 || i == row - 1) && (j == column || j == column)) {
                    array[i][j] = temp;
                } else if ((i == row || i == row) && (j == column + 1 || j == column - 1)) {
                    array[i][j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr =  {{62, 12, 86, 96, 2},
                        {78, 98, 10, 45, 86},
                        {82, 59, 47, 88, 79},
                        {99, 10, 91, 73, 88},
                        {32, 48, 8, 87, 55}
        };
        PushTheNumbers.push(arr, 2, 1);
    }
}
