package ru.job4j.array;

public class OddPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 5, 2, 7};
        OddPrint.print(array);
    }
}
