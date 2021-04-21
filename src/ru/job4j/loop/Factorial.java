package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[]args) {
        System.out.println(calc(1));
    }
}
