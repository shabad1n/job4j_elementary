package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder str = new StringBuilder("");
        char temp;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                temp = s.charAt(i);
                str.toString();
                str.append(temp);
            } else if (s.charAt(i) == ' ') {
                temp = s.charAt(i + 1);
                str.append(temp);
            }
        }
        return  str.toString();
    }

    public static void main(String[] args) {
        System.out.println(Abbreviation.collect("Ad Ds As"));
    }
}
