package ru.job4j.array;

public class NoConsecutive {
    public static int find(int[] data) {
        int rsl = -1;
        for (int i = 0; i < data.length - 1; i++) {
            if (data.length >= 2 && data[i + 1] >= data[i] + 2) {
                rsl = data[i + 1];
                System.out.println(rsl);
                return rsl;
            }
        }
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        NoConsecutive.find(arr);
    }
}
