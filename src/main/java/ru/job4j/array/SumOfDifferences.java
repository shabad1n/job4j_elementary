package ru.job4j.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                sum += nums[i] - nums[i + 1];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 5, 4, 3, 2, 1};
        SumOfDifferences.sum(array);
    }
}
