import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = input.nextDouble();

        System.out.print("Введите точность вычисления (например, 0.0001): ");
        double epsilon = input.nextDouble();

        input.close();

        if (epsilon <= 0) {
            System.out.println("Ошибка: точность должна быть положительным числом!");
            return;
        }

        System.out.println("----------------------------------------------");

        double result = 0.0;
        double term = 1.0; // первый член ряда = 1
        int n = 0;

        System.out.printf("%-5s %-15s %-15s%n", "n", "Член ряда", "Сумма");

        while (Math.abs(term) >= epsilon) {
            result += term;

            System.out.printf("%-5d %-15.8f %-15.8f%n", n, term, result);

            n++;
            term = term * x / n;
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Вычисленное значение: exp(%.4f) = %.10f%n", x, result);
        System.out.printf("Точное значение:      exp(%.4f) = %.10f%n", x, Math.exp(x));
        System.out.printf("Итоговая погрешность: %.10f%n", Math.abs(result - Math.exp(x)));
    }
}