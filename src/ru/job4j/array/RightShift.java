package ru.job4j.array;

public class RightShift {
    public static void shift(int[] nums, int count) {
        while (count != 0) {
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - 1];
                nums[nums.length - 1] = temp;
            }
            count--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        RightShift.shift(arr, 2);
    }
}
