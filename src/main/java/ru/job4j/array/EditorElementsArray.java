package ru.job4j.array;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > el) {
                    array[i][j] = array[i][j] - el;
                } else if (array[i][j] <= el) {
                    array[i][j] = 0;
                }
                System.out.println(array[i][j]);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] arr = {{1}, {2, 3, 4}, {5, 2, 1}};
        EditorElementsArray.changeData(arr, 4);
    }
}
