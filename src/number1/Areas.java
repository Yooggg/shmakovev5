package number1;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        System.out.println("Введите площадь какой фигуры посчитать- ");
        System.out.println("1 - Квадрат \t 2 - Круг \t 3 - Прямоугольный треугольник");

        Scanner scanner = new Scanner(System.in);
        int areaID = scanner.nextInt();
        boolean check = true;
        Area area;
        while (check){
            switch (areaID) {
                case 1 -> {
                    System.out.println("Введите сторону квадрата - ");
                    area = new Square(scanner.nextInt());
                    System.out.println(area.calculateArea());
                    check = false;
                }
                case 2 -> {
                    System.out.println("Введите радиус окружности - ");
                    area = new Circle(scanner.nextInt());
                    System.out.println(area.calculateArea());
                    check = false;
                }
                case 3 -> {
                    System.out.println("Введите катеты треугольника - ");
                    area = new RightTriangle(scanner.nextInt(), scanner.nextInt());
                    System.out.println(area.calculateArea());
                    check = false;
                }
                default -> {
                    System.out.println("Введите нужное число -");
                    areaID = scanner.nextInt();
                }
            }
        }
    }
}