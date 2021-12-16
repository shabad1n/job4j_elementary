package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        String rsl = "";
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1 && words.length > 1) {
                rsl += words[i] + " ";
            } else {
                rsl += words[i];
            }
        }
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        String[] str = {"one", "two"};
        WordsToText.convert(str);
    }
}
