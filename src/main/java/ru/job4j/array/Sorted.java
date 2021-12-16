package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                rsl = false;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        Sorted.isSorted(array);
    }
}


