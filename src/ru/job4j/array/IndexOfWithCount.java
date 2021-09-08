package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        String str = String.valueOf(string);
        int sum = str.indexOf(c);
        for (int i = 1; i < number; i++) {
            if (sum > -1 && number != 1) {
                sum = str.indexOf(c, sum + 1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        char[] str = new char[] {'a', 'b', 'c', 'd', 'e', 'c', 'c'};
        IndexOfWithCount.indexOf(str, 'c', 3);
    }
}
