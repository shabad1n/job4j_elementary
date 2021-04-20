package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = 0;
        if (first >= second && first >= third) {
           result = first;
        }
        if (second >= third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }

    public static void main(String[]args) {
        int rsl = ThreeMax.max(1, 10, 10);
        System.out.println(rsl);
    }
}
