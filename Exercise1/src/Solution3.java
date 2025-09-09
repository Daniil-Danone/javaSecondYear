import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            ArrayList<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.printf("Введите число %d: ", i + 1);
                int num = input.nextInt();
                numbers.add(num);
            }

            input.close();

            // Выводим введенные числа
            System.out.println("Числа: " + numbers);

            // Вычисляем произведение
            int production = 1;
            for (int num : numbers) {
                production *= num;
            }
            System.out.println("Произведение: " + production);

            // Вычисляем среднее арифметическое
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            double average = (double) sum / numbers.size();
            System.out.println("Среднее арифметическое: " + average);

            // Сортируем числа по возрастанию
            Collections.sort(numbers);
            System.out.println("Числа в порядке возрастания: " + numbers);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
