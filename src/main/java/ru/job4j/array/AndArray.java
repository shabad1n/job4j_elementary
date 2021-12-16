package ru.job4j.array;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int lengthrslarr = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    lengthrslarr++;
                }
            }
        }
        System.out.println(lengthrslarr);
        int[] rslarr = new int[lengthrslarr];
        lengthrslarr = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    rslarr[lengthrslarr] = left[i];
                    lengthrslarr++;
                }
            }
        }
        return rslarr;
    }

    public static void main(String[] args) {
        int[] left = new int[]{1, 2, 3, 4, 5};
        int[] right = new int[]{2, 1, 4, 6, 7};
        AndArray.and(left, right);
    }
}
