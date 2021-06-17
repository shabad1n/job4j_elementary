package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        int com = data[0] + data[1];
        boolean rsl = true;
        for (int i = 2; i < data.length; i++) {
            if (data[i] == com) {
                com = data[i] + data[i - 1];
            } else {
                rsl = false;
            }
        }
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        Fibonacci.checkArray(array);
    }
}
