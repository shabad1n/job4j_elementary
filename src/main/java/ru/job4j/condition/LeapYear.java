package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean rsl = false;
        if (year % 4 != 0 || year % 400 != 0 && year % 100 == 0) {
            System.out.println("Год не является високосным");
        } else if (year % 4 == 0 || year % 400 == 0) {
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        boolean temp = LeapYear.checkYear(2000);
        System.out.println(temp);
    }
}
