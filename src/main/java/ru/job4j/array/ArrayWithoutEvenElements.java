package ru.job4j.array;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int colnewarr = 0;
        int col = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                colnewarr++;
            }
        }
        int[] rslarr = new int[colnewarr];
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                rslarr[col] = data[i];
                System.out.println(rslarr[col]);
                col++;
            }
        }
        return rslarr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayWithoutEvenElements.changeData(arr);
    }
}
