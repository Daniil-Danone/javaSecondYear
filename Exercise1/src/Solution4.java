import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            // Ввод коэффициентов
            System.out.print("Введите коэффициент a: ");
            double a = input.nextDouble();

            System.out.print("Введите коэффициент b: ");
            double b = input.nextDouble();

            System.out.print("Введите коэффициент c: ");
            double c = input.nextDouble();

            input.close();

            if (a == 0) {
                // Линейное
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("x ∈ R (0 = 0)");
                    } else {
                        System.out.println("x ∈ ∅ (" + c + " = 0)");
                    }
                } else {
                    double root = -c / b;
                    System.out.println("x = " + root);
                }
            } else {
                // Квадратное
                double discriminant = b * b - 4 * a * c;
                System.out.println("D = " + discriminant);

                if (discriminant > 0) {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                    System.out.println("x1 = " + root1);
                    System.out.println("x2 = " + root2);

                } else if (discriminant == 0) {
                    double root = -b / (2 * a);

                    System.out.println("x = " + root);
                } else {
                    double realPart = -b / (2 * a);
                    double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

                    System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
                    System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}