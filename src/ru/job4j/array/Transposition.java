package ru.job4j.array;

public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[j][i];
                System.out.println(result[i][j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = new int[][] {{1, 2, 3}, {4, 5, 6}};
        Transposition.convert(array);
    }
}
