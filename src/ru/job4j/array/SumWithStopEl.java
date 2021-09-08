package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int rsl = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < el) {
                rsl += data[i];
            } else {
               rsl = rsl % 2 == 0 ? rsl : 0;
            }
        }
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        int[] rsl = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SumWithStopEl.count(rsl, 5);
    }
}

