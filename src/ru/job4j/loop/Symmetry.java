package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int row) {
        String str = Integer.toString(row);
        boolean rsl = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        boolean temp = Symmetry.check(1112111);
        System.out.println(temp);
    }
}
