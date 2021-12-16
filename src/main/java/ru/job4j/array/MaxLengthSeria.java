package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int sum = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sum = 1;
            } else {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 0, 1, 2, 3, 4};
        MaxLengthSeria.find(arr);
    }
}
