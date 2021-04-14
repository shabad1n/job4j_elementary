package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rls = (height - 120) * 1.15;
        return rls;
    }
    public static double womanWeight(short height) {
        double rls = (height - 140) * 1.15;
        return rls;
    }
    public static void main(String[] args) {
        short height = 200;
        double man = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman " + height + " is " + woman);
    }
}
