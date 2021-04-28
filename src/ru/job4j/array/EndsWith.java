package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if(post[post.length -1 -i] != word[word.length - 1 - i]) {
                result = false;
                break;
            }
    }
        return result;
}

    public static void main(String[] args) {
        char[] word = new char[] {'K', 'i', 'r', 'i', 'l', 'l'};
        char[] post = new char[] {'l', 'l'};
        boolean rsl = EndsWith.endsWith(word, post);
        System.out.println(rsl);
    }
}
