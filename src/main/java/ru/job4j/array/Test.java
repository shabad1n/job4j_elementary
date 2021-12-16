package ru.job4j.array;

public class Test {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int index = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        String temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}

