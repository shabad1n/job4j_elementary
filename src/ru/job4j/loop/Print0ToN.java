package ru.job4j.loop;

public class Print0ToN {
    public static void out(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Print0ToN.out(15);
    }
}
