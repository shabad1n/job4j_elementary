package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        int temp = 0;
        for (int i = 0; i < seq.length; i++) {
            if (i < 5) {
                seq[i] = '0';
            } else if (i == seq.length - 5 + temp) {
                seq[i] = '1';
                temp++;
            }
            System.out.println(seq[i]);
        }
        return seq;
    }

    public static void main(String[] args) {
        String str = "222222333333";
        char[] array = str.toCharArray();
        DestroySequence.destroy(array);
    }
}
