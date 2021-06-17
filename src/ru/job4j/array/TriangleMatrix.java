package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int temp = 1;
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
        }
            for (int n = 0; n < triangle.length; n++) {
                for(int j = 0; j < triangle[n].length; j++) {
                    triangle[n][j] = temp;
                    System.out.println(triangle[n][j]);
                    temp++;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        TriangleMatrix.rows(3);
    }
}
