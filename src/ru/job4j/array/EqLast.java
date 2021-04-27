package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        int[] com = new int[] {1, 2, 3, 4};
        boolean rsl = EqLast.check(arr, com);
        System.out.println(rsl);
    }
}
