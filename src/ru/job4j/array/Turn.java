package ru.job4j.array;

    public class Turn {
        public static int[] back(int[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            return array;
            }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 4, 5, 8, 2, 9};
        int[] rsl = Turn.back(arr);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}
