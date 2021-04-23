package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {

        for (int cell = 0; cell < size; cell++) {
            for (int row = 0; row < size; row++) {
                boolean left = cell == 0;
                boolean right = row == size - 1 - cell;
                if (left) {
                    System.out.print("x");
                } else if (right) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[]args) {
        draw(5);
    }
}
