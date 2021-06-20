package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int[] ag = new int[array[row].length];
        int[] aw = new int[array[row].length];
        int[] ac = new int[array[row].length];

        for (int i = 0; i < array[row].length; i++) {
            aw[i] = array[i][column];
        }

        if (row == array.length - 1) {
            java.lang.System.arraycopy(array[row], 1, ag, 0, 1);
            java.lang.System.arraycopy(array[row], 1, ag, 2, 2);
            java.lang.System.arraycopy(aw, 1, ac, 0, 3);
        } else {
            java.lang.System.arraycopy(array[row], 1, ag, 0, array[row].length - row  - 1);
            java.lang.System.arraycopy(array[row], row, ag, row + 1, array[row].length - row - 1);
            java.lang.System.arraycopy(aw, 1, ac, 0, array[row].length - column  - 1);
            java.lang.System.arraycopy(aw, column, ac, column + 1, array[row].length - column - 1);
        }

        for (int i = 0; i < array[row].length; i++) {
            System.out.print(ag[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array[row].length; i++) {
            System.out.print(ac[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array[row].length; i++) {
            array[i][column] = ac[i];
        }
        System.out.println();
        for (int i = 0; i < array[row].length; i++) {
            array[row][i] = ag[i];
        }

            System.out.println();
        for (int i = 0; i < array[row].length; i++) {
            System.out.println();
            for (int j = 0; j < array[row].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }


    public static void main(String[] args) {
        int [][] array = {
                {62, 12, 86, 96, 2},
                {78, 98, 10, 45, 86},
                {82, 59, 47, 88, 79},
                {99, 10, 91, 73, 88},
                {32, 48, 8, 87, 55 }
        };
        PushTheNumbers.push(array, 2, 2);
    }
}
