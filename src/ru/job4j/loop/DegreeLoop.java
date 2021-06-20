package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int sum = a;
        for (int i = 1; i < n; i++) {
           sum *= a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(DegreeLoop.calculate(2, 3));
    }
}
