package ru.job4j.array;

import java.util.Random;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String rsl = "";
        int temp = 0;
        for (int i = 0; i < num; i++) {
            if (temp > prizes.length - 1) {
                temp = 0;
            }
            temp++;
        }
        rsl += prizes[temp - 1];
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        String[] prizes = {"car", "ticket", "flat", "house"};
        int n = (int) (Math.random() * 100) + 1;
        System.out.println(n);
        RandomDream.random(prizes, n);
    }
}
