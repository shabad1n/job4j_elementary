package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i <= hours.length -1; i++) {
            if (i <= 4 && hours[i] > 0) {
                salary += 10 * (hours[i] > 8 ? 8 : hours[i]) + (15 * (hours[i] < 8 ? 0 : hours[i] - 8));
            } else {
                salary += 20 * (hours[i] > 8 ? 8 : hours[i]) + (30 * (hours[i] < 8 ? 0 : hours[i] - 8));
            }
        }
        return salary;
    }

    public static void main(String[] args) {
        int[] rsl = {10, 0, 12, 0, 8, 12, 4};
        int val = WeeklySalary.calculate(rsl);
        System.out.println(val);
    }
}
