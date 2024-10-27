package ru.сourses.numbers;

public class SumSecond {
    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            if (isNumeric(arg)) {
                double number = Double.parseDouble(arg);
                sum += number;
            } else {
                System.out.println("Некорректное значение: " + arg + ", считаем за 0");
            }
        }

        System.out.println("Сумма: " + sum);
    }

     static boolean isNumeric(String str) {
         return str != null && str.matches("-?\\d+(\\.\\d+)?");
         //("-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?") или такая тоже подходит
     }
}
