package ru.сourses.numbers;
import java.util.Scanner;
public class Exponentiation{

    public static double exponentiation(String x, String y) {
        int base = Integer.parseInt(x);
        int exponent = Integer.parseInt(y);

        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        String x = scanner.nextLine();

        System.out.print("Введите число y: ");
        String y = scanner.nextLine();

        double result = exponentiation(x, y);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}
