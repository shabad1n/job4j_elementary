package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first >= second && first >= third) {
          return result;
        }
        result = second;
        if (second >= first && second >= third) {
            return result;
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
