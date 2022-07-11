package Level_1;
import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите х у точки A треугольника: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Введите х у точки B треугольника: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Введите х у точки C треугольника: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double area = (((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))/2);
        System.out.println("Площадь треугольника равна: " + area);
    }
}
