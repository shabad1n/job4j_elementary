package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        double lengtharray = 0;
        int countstr = 0;
        int countcol = 0;

        for (int i = 0; i < array.length; i++) {
            lengtharray += array[i].length;
        }

        int com = (int) Math.ceil(Math.sqrt(lengtharray));
        int[][] rslarray = new int[com][com];
        for (int i = 0; i < rslarray.length; i++) {
            for (int j = 0; j < rslarray[i].length; j++) {
                if (countcol < array[countstr].length) {
                    rslarray[i][j] = array[countstr][countcol];
                    countcol++;
                } else if (countstr < array.length - 1) {
                    countstr++;
                    countcol = 0;
                    rslarray[i][j] = array[countstr][countcol];
                    countcol++;
                }
                System.out.println(rslarray[i][j]);
            }
        }
        return rslarray;
    }

    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9}, {1}};
        Converter.convertInSquareArray(array);
    }
}
