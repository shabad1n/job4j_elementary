package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            } else if (ints[i] < min) {
                min = ints[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 15, 20, 2, 10, 6};
        SubtractMinMax.calculate(arr);
    }
}
