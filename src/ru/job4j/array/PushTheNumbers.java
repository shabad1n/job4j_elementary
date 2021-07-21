package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int temp = array[row][column];
        int com = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == row - 1 || i == row + 1) {
                int var = i;
                while (var >= 0 || var <= array.length) {
                    if (var == 0 || var == array.length - 1) {
                        array[var][column] = array[row][column];
                        break;
                    } else {
                        com = array[var][column];
                        array[var][column] = array[row][column];
                        array[row][column] = com;
                        var = var < row ? var - 1 : var + 1;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == column - 1 || i == column + 1) {
                int var = i;
                while (var >= 0 || var <= array.length) {
                    if (var == 0 || var == array.length - 1) {
                        array[row][var] = array[row][column];
                        break;
                    } else {
                        com = array[row][var];
                        array[row][var] = array[row][column];
                        array[row][column] = com;
                        var = var < column ? var - 1 : var + 1;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
       array[row][column] = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == row + 1 || i == row - 1) && (j == column || j == column)) {
                    array[i][j] = temp;
                } else if ((i == row || i == row) && (j == column + 1 || j == column - 1)) {
                    array[i][j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr =   {{62, 12, 10, 96, 2, 3},
                         {78, 98, 47, 45, 86, 4},
                         {59, 47, 71, 47, 88, 5},
                         {99, 10, 47, 73, 88, 6},
                         {32, 48, 91, 87, 55, 7},
                         {12, 13, 22, 41, 66, 81}
        };
        PushTheNumbers.push(arr, 3, 1);
    }
}
