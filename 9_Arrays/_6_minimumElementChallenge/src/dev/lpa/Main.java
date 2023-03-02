package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));

        System.out.println(findMin(array));

        reverse(array);
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(reversedCopy(array)));
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert numbers separated by a comma: ");
        String[] sArray = scanner.nextLine().split(",");
        int[] intArray = new int[sArray.length];

        for (int i = 0; i < sArray.length; i++) {
            intArray[i] = Integer.parseInt(sArray[i].trim());
        }

        return intArray;
    }

    private static int findMin(int[] array) {
//        int min = Integer.MAX_VALUE;
//        for(int el:array){
//            if(el<min){
//                min=el;
//            }
//        }

        Arrays.sort(array);
        return array[0];
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        for (int i = 0; i <= array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    private static int[] reversedCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length-1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
}
