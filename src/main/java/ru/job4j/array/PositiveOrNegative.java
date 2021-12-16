package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean rsl = false;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                sum2++;
            } else {
                sum1++;
            }
        }
        System.out.println(sum2 + " " + sum1);
         rsl = sum2 % 2 != 0 ? true : rsl;
        return rsl;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, -4, 5, 6};
        PositiveOrNegative.check(arr);
    }
}
