package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static int sum(int i) {
        return x + i;
    }

    public static int minus(int i) {
        return i - x;
    }

    public double divide(int i) {
        return i / x;
    }

    public double multiply(int a) {
        return x * a;
    }

    public double sumAllOperation(int i) {
        return sum(i) + minus(i) + this.divide(i) * multiply(i);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumAllOperation(5));
    }
}
