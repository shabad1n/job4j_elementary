package ru.job4j.array;

public class AlgoArray {
    public static void main(String[]args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[1];
        array[1] = array[4];
        array[4] = temp;
        temp = array[2];
        array[2] = array[4];
        array[4] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        for(int arr : array) {
            System.out.println(arr);
        }
    }
}
