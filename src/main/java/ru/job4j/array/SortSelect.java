package ru.job4j.array;

public class SortSelect {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
                }
        return data;
            }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 5, 2, 4};
        int[] rsl = SortSelect.sort(arr);
        for (int result : arr) {
            System.out.println(result);
        }
    }
}
