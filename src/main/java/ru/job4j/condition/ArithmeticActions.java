package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String temp = "none";
        if (left + right == rsl) {
            temp = "added";
        } else if (left - right == rsl) {
            temp = "subtracted";
        } else if (left * right == rsl) {
            temp = "multiplied";
        } else if (left / right == rsl) {
            temp = "divided";
        }
        return temp;
    }

    public static void main(String[] args) {
        String rsl = ArithmeticActions.selectAction(5, 10, 241);
        System.out.println(rsl);
    }
}
