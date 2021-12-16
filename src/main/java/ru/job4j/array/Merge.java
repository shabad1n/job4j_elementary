package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int n = 0;
        int k = 0;
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (n > left.length - 1) {
                rsl[i] = right[k];
                k++;
            } else if (k > right.length - 1) {
                rsl[i] = left[n];
                n++;
            } else if (left[n] < right[k]) {
                rsl[i] = left[n];
                n++;
            } else {
                rsl[i] = right[k];
                k++;
            }
            System.out.println(rsl[i]);
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] left = new int[]{1, 4, 5, 6, 8};
        int[] right = new int[]{3, 4, 5, 7};
        Merge.merge(left, right);
    }
}
