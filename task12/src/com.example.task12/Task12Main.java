package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr != null && arr.length != 0)
        {
            for (int left = 0; left < arr.length; left++) {
                int minInd = left;
                for (int i = left; i < arr.length; i++) {
                    if (arr[i] < arr[minInd]) {
                        minInd = i;
                    }
                }
                int temp = arr[minInd];
                arr[minInd] = arr[left];
                arr[left] = temp;
            }
        }
    }

}