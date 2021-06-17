package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder rsl = new StringBuilder(s);
        String str = "empty";
        for (int i = 0; i < s.length(); i++) {
            if (s.length() <= 3  && i >= 0) {
                str = s;
                break;
            } else if (i < s.length() - 4) {
                rsl.setCharAt(i, '#');
                str = rsl.toString();
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String car = Cryptography.code("");
        System.out.println(car);
    }
}
