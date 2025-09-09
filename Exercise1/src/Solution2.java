import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            ArrayList<Double> numbers = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.printf("Введите число %d: ", i + 1);
                double num = input.nextDouble();
                numbers.add(num);
            }

            input.close();

            // Выводим введенные числа
            System.out.println("Числа: " + numbers);

            // Вычисляем произведение
            double production = 1;
            for (double num : numbers) {
                production *= num;
            }
            System.out.println("Произведение: " + production);

            // Вычисляем среднее арифметическое
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            double average = sum / numbers.size();
            System.out.println("Среднее арифметическое: " + average);

            // Сортируем числа по возрастанию
            Collections.sort(numbers);
            System.out.println("Числа в порядке возрастания: " + numbers);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
