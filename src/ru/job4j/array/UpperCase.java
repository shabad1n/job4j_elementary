package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                string[i] = Character.toUpperCase(string[i]);
            }
            System.out.println(string[i]);
        }
        return string;
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'c', 'F', 'b', 'A'};
        UpperCase.toUpperCase(arr);
    }
}
