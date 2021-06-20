package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int sum = 0;
        while (length - section >= 0) {
            length -= section;
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SectionCount.count(15, 5));
    }
}
