package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 10, 15, 25};
        int rsl = FindLoop.indexOf(arr, 5);
        System.out.println(rsl);
    }
}
