package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int sum = 0;
        boolean rsl = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                sum++;
            }
        }
        System.out.println(data.length / 2);
        return sum <= data.length / 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 4, 1, 5, 6, 7, 1, 8, 9};
        Validator.checkArray(arr, 1);
    }
}
