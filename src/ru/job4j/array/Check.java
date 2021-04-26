package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            result = data[0];
            if (data[i] != result) {
                result = false;
                break;
            } else {
                 result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] arr = new boolean[] {false, false, false};
        boolean rsl = Check.mono(arr);
        System.out.println(rsl);
    }
}
