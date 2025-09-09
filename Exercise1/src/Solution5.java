import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Введите x1 (начало): ");
            double start = input.nextDouble();

            System.out.print("Введите x2 (конец): ");
            double end = input.nextDouble();

            System.out.print("Введите шаг: ");
            double step = input.nextDouble();

            input.close();

            // Проверка корректности введенных данных
            if (step <= 0) {
                System.out.println("Ошибка: шаг должен быть положительным числом!");
                return;
            }

            if (start > end) {
                System.out.println("Ошибка: начальное значение не может быть больше конечного!");
                return;
            }

            System.out.printf("%-10s %-15s%n", "x", "sin(x)");

            double x = start;

            while (x <= end) {
                double sinValue = Math.sin(x);

                // Форматированный вывод
                System.out.printf("%-10.5f %-15.5f%n", x, sinValue);

                x += step;
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}