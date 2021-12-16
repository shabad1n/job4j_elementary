package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int rsl = data[0];
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[i]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] com = SortSelected.sort(data);
        for (int rsl : com) {
            System.out.println(rsl);
        }
    }
}
