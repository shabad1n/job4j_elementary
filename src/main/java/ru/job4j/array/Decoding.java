package ru.job4j.array;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = ints[i] % number;
            System.out.println(ints[i]);
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 7, 8, 12, 15, 16};
        Decoding.decode(arr, 4);
    }
}
