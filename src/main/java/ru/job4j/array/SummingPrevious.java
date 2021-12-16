package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        int temp = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (i == 0 || i == 1) {
                rsl[i] = i == 0 ? a : b;
                temp += rsl[i];
            } else {
                rsl[i] = temp;
                temp += rsl[i];
            }
            System.out.println(rsl[i]);
        }
        return rsl;
    }

    public static void main(String[] args) {
       SummingPrevious.calculate(4, 3, 5);
    }
}
