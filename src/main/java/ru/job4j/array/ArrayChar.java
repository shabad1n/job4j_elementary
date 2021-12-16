package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
              result = false;
              break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] arr = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] com = new char[] {'H', 'e', 'l'};
        boolean res = ArrayChar.startsWith(arr, com);
        System.out.println(res);
    }
}
