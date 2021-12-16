package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int com = a;
        for (int i = a; i < b; i++) {
            com *= (i + 1);
        }
        return com;
    }

    public static void main(String[] args) {
        System.out.println(MultiplicationLoop.mult(2, 4));
    }
}
