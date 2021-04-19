package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        boolean val = (x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0) && (x1 != 8 && y1 != 8 && x2 != 8 && y2 != 8);
        int rsl = 0;
        if (val) {
            int x = Math.abs(x2 - x1);
            int y = Math.abs(y2 - y1);
            rsl = x == y ? Math.abs(x2 - x1) : rsl;
        }
        return rsl;
    }

    public static void main(String[]args) {
        int rls = ChessBoard.way(6, 7, 1, 2);
        System.out.println(rls);
    }
}
