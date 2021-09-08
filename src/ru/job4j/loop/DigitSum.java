package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int rsl = 0;
        while (num != 0) {
            rsl += num % 10;
            num /= 10;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(DigitSum.sum(20));
    }
}
