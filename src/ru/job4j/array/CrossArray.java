package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (left[i] == right[j]) {
                    System.out.println(left[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] left = new int[]{1, 2, 3};
        int[] right = new int[]{1, 3, 4};
        CrossArray.printCrossEl(left, right);
    }
}
