package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + "; your age " + age + " years old");
    }

    public static void main(String[] args) {
        String name = "Kirill Gavrilov";
        int age = 25;

        ArgMethod.hello(name, age);

        ArgMethod.hello(name, age);

        ArgMethod.hello(name,age);

        ArgMethod.hello(name,age);
    }
}
