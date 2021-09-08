package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
                    rsl[row] = board[row][row];
                    System.out.println(rsl[row]);
                }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 'X' && (monoHorizontal(board, row) || monoVertical(board, row))) {
                    result = true;
                    break;
                }
            }
        return result;
    }

    public static void main(String[] args) {
        char[][] array = {
                {'X', 'X', 'X'},
                {'X', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] rsl = MatrixCheck.extractDiagonal(array);
        for (char e : rsl) {
            System.out.println(e);
        }
        boolean val = MatrixCheck.isWin(array);
        System.out.println(val);

    }
}
