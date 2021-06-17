package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
        int temp = a;
        for (int i = a; i <= b; i++) {
            if (i == temp) {
                sum += i;
                temp += 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SecondSum.sum(0, 5));
    }
}
