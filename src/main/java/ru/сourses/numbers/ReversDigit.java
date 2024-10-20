package ru.сourses.numbers;

import java.util.ArrayList;

public class ReversDigit {

    public static void reverse(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {

            int temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        reverse(list);

        System.out.println("Список в обратном порядке: " + list);
    }
}
