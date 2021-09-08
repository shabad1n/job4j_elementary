package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = (amount + (amount * percent) / 100) - salary;
            year++;
        }
        return year;
    }

    public static void main(String[]args) {
        int rsl = Mortgage.year(15000, 12000, 50);
        System.out.println(rsl);
    }
}
