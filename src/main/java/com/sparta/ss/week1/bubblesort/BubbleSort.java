package com.sparta.ss.week1.bubblesort;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort {
    private static Logger bubbleSortLogger = Logger.getLogger("bubbleSortLogger");
    static void bubbleSort(int[] numbers) {
        bubbleSortLogger.log(Level.INFO, "Start of method");
        int len = numbers.length;
        int a = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    bubbleSortLogger.log(Level.INFO, "Starting if i is " + i);
                    a = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = a;
                }
            }
        }
        bubbleSortLogger.log(Level.INFO, "Method Ended, array is " + Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        int[] numbers = {100,53,43,10,59,60,13,45};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
