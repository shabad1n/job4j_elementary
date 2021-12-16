package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int temp = count + (count / n);
    return temp;
}

    public static void main(String[] args) {
        int rsl = BonusCupCoffee.countCup(13, 5);
        System.out.println(rsl);
    }
}
