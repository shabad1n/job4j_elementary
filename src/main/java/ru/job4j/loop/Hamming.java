package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int sum = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int rsl = Hamming.checkStrings("Кирилл", "Кирилп");
        System.out.println(rsl);
    }
}
