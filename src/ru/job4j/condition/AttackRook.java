package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        boolean rsl = false;
        if (left.charAt(0) == right.charAt(0) || left.charAt(1) == right.charAt(1)) {
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        boolean temp = AttackRook.check("A8", "B8");
        System.out.println(temp);
    }
}
