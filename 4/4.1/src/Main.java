import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        Fraction first = new Fraction();
        Fraction second = new Fraction(4, 3, 2);
        Fraction third = new Fraction(5, 2,3);
        Fraction fourth = new Fraction(3, 2,4);
        ArrayList<Fraction> fractions = new ArrayList<>();

        fractions.add(first);
        fractions.add(second);
        fractions.add(third);
        fractions.add(fourth);

        System.out.println("|№ п/п|Дробь |Десятичная дробь|");
        fractions.stream().forEach(s->System.out.printf("|%-4d |%-5s |%-16.1f|\n",
                                            s.getNumber(), s.toString(), s.toDecimal()));
        System.out.println("\n");
        task2(fractions);
        task3(fractions);
    }
    public static void task2(ArrayList<Fraction> fractions){
        System.out.printf("|Дробь |%-2s+n |%-2s-n |%-2s*n |\n",
                fractions.get(2).toString(),fractions.get(2).toString(),fractions.get(2).toString());
        fractions.stream().filter(x->x.getNumber()!=3).forEach(x-> System.out.printf("|%-6s|%-6s|%-6s|%-6s|\n",
                    x.toString(), Fraction.plus(x, fractions.get(2)).toString(),
                                  Fraction.minus(x, fractions.get(2)).toString(),
                                  Fraction.multiply(x, fractions.get(2)).toString()));
    }
    public static void task3(ArrayList<Fraction> fractions) {
        System.out.println("1. Увеличить числитель первой дроби");
        System.out.println("2. Увеличить знаменатель первой дроби");
        boolean key = true;
        while (key) {
            try {
                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();
                key = false;
                if (choice == 1) {
                    System.out.print(":");
                    int increase = input.nextInt();
                    fractions.get(0).increaseNumerator(increase);
                } else if (choice == 2) {
                    System.out.print(":");
                    int increase = input.nextInt();
                    fractions.get(0).increaseDenominator(increase);
                } else {
                    System.out.println("Неверный ввод.");
                    key = true;
                }
            } catch (Exception e) {
                System.out.println("Неверный ввод.");
                key = true;
            }
        }
            System.out.println("|Дробь |Десятичная дробь|");
            System.out.printf("|%-5s |%-16.1f|\n", fractions.get(0).toString(), fractions.get(0).toDecimal());
    }
}
