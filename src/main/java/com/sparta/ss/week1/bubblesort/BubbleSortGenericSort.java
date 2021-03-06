package com.sparta.ss.week1.bubblesort;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSortGenericSort<T extends Number> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    static int[] bubbleSort(int[] numbers) {
        int len = numbers.length;
        int a = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    a = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = a;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {100,53,43,10,59,60,13,45};
        int[] array = bubbleSort(numbers);
        System.out.println(Arrays.toString(array));
        BubbleSortGenericSort<Integer> number = new BubbleSortGenericSort<>();
        for (int i = 0; i < array.length; i++) {
            number.setItem(i);
        }
    }
}
