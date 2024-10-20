package ru.сourses.numbers;

public class BubbleSort {
    public static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {

                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {94, 55, 25, 4, 2, 11, 90};
        bubbleSort(array);
        System.out.println("Отсортированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
