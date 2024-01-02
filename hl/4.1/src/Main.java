import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task();
    }
    static void task(){
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4,new int[]{1, 4});
        Circle circle3 = new Circle(2, new int[]{3, 6});
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);

        System.out.println("№  Центр   Радиус  Площадь  Четверть");
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1+"  "+ Arrays.toString(circles.get(i).getCenter()) + "  " + circles.get(i).getRadius() + "     " + circles.get(i).square() + "       " + circles.get(i).quarter() );
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Введите номера окружностей:");
        System.out.println(Circle.areInOneQuarter(circles.get(input.nextInt() - 1), circles.get(input.nextInt() - 1)));

        System.out.println("Введите номер кружности для изменения:");
        int number = input.nextInt();
        System.out.println("Введите смещение окружности");
        int shift = input.nextInt();
        circles.get(number - 1).shift(shift);
        System.out.println("Центр   Радиус  Площадь  Четверть");
        System.out.println(Arrays.toString(circles.get(number - 1).getCenter()) + "  " + circles.get(number - 1).getRadius() + "     " + circles.get(number - 1).square() + "       " + circles.get(number - 1).quarter() );
    }
}
