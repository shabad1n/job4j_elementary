package ru.job4j.array;

public class EvenPrint {
    public static void print(int[] array) {
        for (int j = array.length - 1; j >= 0; j--) {
            if (array[j] % 2 == 0) {
                System.out.println(array[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        EvenPrint.print(array);
    }
}
