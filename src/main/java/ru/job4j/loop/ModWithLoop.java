package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int sum = 0;
        while (n - d >= 0) {
            sum = n - (n / d * d);
            n -= d;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(ModWithLoop.mod(8, 3));
    }
}
