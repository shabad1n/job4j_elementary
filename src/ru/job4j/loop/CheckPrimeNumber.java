package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
         }
        return prime;
    }

    public static void main(String[]args) {
        boolean rsl = CheckPrimeNumber.check(25);
        System.out.println(rsl);
    }

}
