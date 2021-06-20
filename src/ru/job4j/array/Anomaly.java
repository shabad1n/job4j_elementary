package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int count = 0;
        int[][] rslarr = new int[data.length][];
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                int[] arr = new int[2];
                arr[0] = i;
                while (data[i] <= down || data[i] >= up) {
                    arr[1] = i;
                    i++;
                    if (i > data.length - 1) {
                        break;
                    }
                }
                    rslarr[count] = arr;
                    count++;
            }
        }
        return Arrays.copyOf(rslarr, count);
    }

        public static void main(String[]args) {
            int[] arr = new int[]{5, 16, 17, 3, 10, 1, 2};
            Anomaly.found(arr, 16, 4);
            }
        }
