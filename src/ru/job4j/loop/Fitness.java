package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        int k1 = 3;
        int k2 = 2;
        while (ivan <= nik) {
            ivan *= k1;
            nik *= k2;
            month++;
        }
        return month;
    }

    public static void main(String[]args) {
        int rsl = Fitness.calc(90, 90);
        System.out.println(rsl);
    }
}
