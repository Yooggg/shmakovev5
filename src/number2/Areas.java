package number2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int areaID;

        boolean check = true;
        number2.Area area;

        List<number2.Area> figure = new ArrayList<>();
        List<Float> resultsAreas = new ArrayList<>();

        while (check){
            System.out.println("Введите площадь какой фигуры посчитать- ");
            System.out.println("1 - Квадрат \t 2 - Круг \t 3 - Прямоугольный треугольник");
            System.out.println("Введите 4 для остановки программы");
            areaID = scanner.nextInt();
            switch (areaID) {
                case 1 -> {
                    System.out.println("Введите сторону квадрата - ");
                    area = new number2.Square(scanner.nextInt());
                    figure.add(area);
                    resultsAreas.add(area.calculateArea());
                }
                case 2 -> {
                    System.out.println("Введите радиус окружности - ");
                    area = new number2.Circle(scanner.nextInt());
                    figure.add(area);
                    resultsAreas.add(area.calculateArea());
                }
                case 3 -> {
                    System.out.println("Введите катеты треугольника - ");
                    area = new number2.RightTriangle(scanner.nextInt(), scanner.nextInt());
                    figure.add(area);
                    resultsAreas.add(area.calculateArea());
                }
                case 4 -> {
                    System.out.println(figure);
                    System.out.println(resultsAreas);
                    check = false;
                }
            }
        }
    }
}
