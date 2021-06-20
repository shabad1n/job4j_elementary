package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] arr = new int[2 + middle.length];
        int temp = 0;
        int com = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) {
                arr[i] = i == 0 ? left[i] : left[left.length - 1];
            } else if (i % 2 != 0) {
                arr[i] = right[i - 1];
            } else {
                arr[i] = middle[i - 1];
            }
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] left = new int[]{23, 2, 42};
        int[] middle = new int[]{4, 5, 6};
        int[] right = new int[]{8, 9, 10, 11};
        UnionThreeArrays.union(left, middle, right);
    }
}


