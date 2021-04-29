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

    public static void main(String[] args) {
        char[][] array = {
                {'X', 'X', 'X'},
                {'G', 'G', 'G'}
        };
        boolean rsl = MatrixCheck.monoHorizontal(array, 0);
        System.out.println(rsl);
    }
}
