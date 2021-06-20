package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        String rsl = "";
        for (int i = 0; i < fio.length; i++) {
            if (fio[i] != null && i == 0) {
                rsl += fio[i] + " ";
            } else if (fio[i] != null) {
                rsl += fio[i].charAt(0) + ".";
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] fio = {"Гаврилов", "Кирилл", "Александрович"};
        Initials.convert(fio);
    }
}
