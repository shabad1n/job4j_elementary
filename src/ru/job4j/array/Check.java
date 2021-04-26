package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[0] != data[data.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] arr = new boolean[] {true, false, false};
        boolean rsl = Check.mono(arr);
        System.out.println(rsl);
    }
}
