package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int team1 = 0;
        int team2 = 0;
        int win = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                team1 += players[i];
            } else {
                team2 += players[i];
            }
        }
        if (team1 == team2) {
            return win;
        } else {
            win = team1 > team2 ? team1 : team2;
        }
        System.out.println(win);
        return team1 > team2 ? 1 : 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        EvenVsOdd.whoWin(arr);
    }
}
