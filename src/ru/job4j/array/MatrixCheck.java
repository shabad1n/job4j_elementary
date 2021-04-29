package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        char[][] array = {
                {'X', 'X', 'X'},
                {'X', 'G', 'G'}
        };
        boolean rsl = MatrixCheck.monoVertical(array, 0);
        System.out.println(rsl);
    }
}
