import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Введите коэффициенты первого уравнения:");
            System.out.print("a1 = ");
            double a1 = input.nextDouble();
            System.out.print("b1 = ");
            double b1 = input.nextDouble();
            System.out.print("c1 = ");
            double c1 = input.nextDouble();

            System.out.println("Введите коэффициенты второго уравнения:");
            System.out.print("a2 = ");
            double a2 = input.nextDouble();
            System.out.print("b2 = ");
            double b2 = input.nextDouble();
            System.out.print("c2 = ");
            double c2 = input.nextDouble();

            input.close();

            System.out.println("Система уравнений:");
            System.out.printf("%.2fx + %.2fy = %.2f%n", a1, b1, c1);
            System.out.printf("%.2fx + %.2fy = %.2f%n", a2, b2, c2);
            System.out.println();

            double detMain = a1 * b2 - a2 * b1;
            double detX = c1 * b2 - c2 * b1;
            double detY = a1 * c2 - a2 * c1;

            System.out.printf("Δ = %.2f%n", detMain);
            System.out.printf("Δx = %.2f%n", detX);
            System.out.printf("Δy = %.2f%n", detY);

            if (detMain != 0) {
                double x = detX / detMain;
                double y = detY / detMain;

                System.out.println("Система имеет единственное решение:");
                System.out.printf("x = %.4f%n", x);
                System.out.printf("y = %.4f%n", y);

            } else {
                if (Math.abs(detX) < 0 && Math.abs(detY) < 0) {
                    System.out.println("Система имеет бесконечно много решений");
                } else {
                    System.out.println("Система не имеет решений");
                }
            }

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}