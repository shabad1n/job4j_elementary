package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Hi";
        names[1] = "I";
        names[2] = "Kirill";
        names[3] = "Gavrilov";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
