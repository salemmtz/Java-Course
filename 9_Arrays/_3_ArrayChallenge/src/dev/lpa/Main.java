package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] intArray = getRandomArray(5);
        System.out.println(Arrays.toString(intArray));

        int[] sortedArray = sortIntegers(intArray);
        System.out.println(Arrays.toString(sortedArray));


    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] intArray = new int[len];
        for (int i = 0; i < len; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("---->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
