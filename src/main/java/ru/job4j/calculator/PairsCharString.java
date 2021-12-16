package ru.job4j.calculator;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l.isEmpty() && r.isEmpty()) {
            return true;
        }
        return l.charAt(0) == r.charAt(r.length() - 1) && l.charAt(l.length() - 1) == r.charAt(0);
    }

    public static void main(String[]args) {
        boolean rsl = PairsCharString.check("", "");
        System.out.println(rsl);
    }
}
