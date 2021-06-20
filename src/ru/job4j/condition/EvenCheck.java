package ru.job4j.condition;

public class EvenCheck {
    public static boolean check(int num) {
        boolean rsl = false;
        if (num % 2 == 0) {
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(EvenCheck.check(2));
    }
}
