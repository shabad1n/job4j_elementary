package ru.job4j.condition;

public class GameWin {
    public static int checkGame(double percent, int prize, int pay) {
        int temp = (int) (percent * prize) - pay;
        if (temp <= 0) {
            temp = 0;
    }
    return temp;
}

    public static void main(String[] args) {
        int rsl = GameWin.checkGame(0.2, 50, 9);
        System.out.println(rsl);
    }
}
