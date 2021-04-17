package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value/70;
    }

    public static int rubleToDollar(int d) {
        return d/60;
    }

    public static <String> void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        var passed1 = expected == out;
        int out1 = Converter.rubleToEuro(in);
        boolean passed2 = expected == out1;
        System.out.println("60 rubles are 1 dollar : " + passed1);
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are 2 euro : " + passed2);
    }
}
