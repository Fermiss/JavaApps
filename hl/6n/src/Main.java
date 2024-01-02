import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        boolean exit = false;
        while (!exit){
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("1.Вывод данных");
                System.out.println("2.Поиск");
                System.out.println("3.Добавление");
                System.out.println("4.Удаление записи с указанным id");
                System.out.println("5.Редактирование записи с указанным id");
                System.out.println("6.Выход");
                int userChoice = scan.nextInt();
                switch (userChoice) {
                    case 1 -> showElements();
                    case 2 -> searchElement();
                    case 3 -> addElement();
                    case 4 -> delete();
                    case 5 -> updateElement();
                    case 6 -> exit = true;
                }
            } catch (Exception e) {
                System.out.println("Вы ввели неверные данные.");
            }
        }
    }
    public static void searchElement(){
        System.out.println("Введите столицу:");
        System.out.println(new BaseHandler().searchElementByCapital(new Scanner(System.in).nextLine()).toString());
    }
    public static void showElements(){
        List<Gazetteer> lst = new BaseHandler().getAll();
        System.out.println("===================================");
        lst.forEach(x -> System.out.println(x.toString()));
        System.out.println("===================================");
    }
    public static void addElement(){
        Gazetteer el = new Gazetteer();

        System.out.println("Площадь:");
        el.setSquare(Float.parseFloat(new Scanner(System.in).nextLine()));

        System.out.println("Население:");
        el.setPopulation(Float.parseFloat(new Scanner(System.in).nextLine()));

        System.out.println("Континент:");
        el.setContinent(new Scanner(System.in).nextLine());

        System.out.println("Столица:");
        el.setCapital(new Scanner(System.in).nextLine());

        System.out.println("Страна:");
        el.setCountry_name(new Scanner(System.in).nextLine());

        new BaseHandler().insert(el);
    }
    public static void updateElement(){
        Gazetteer ch = new Gazetteer();

        System.out.println("Введите id:");
        ch.setId(new Scanner(System.in).nextInt());

        System.out.println("Площадь:");
        ch.setSquare(Float.parseFloat(new Scanner(System.in).nextLine()));

        System.out.println("Население:");
        ch.setPopulation(Float.parseFloat(new Scanner(System.in).nextLine()));

        System.out.println("Континент:");
        ch.setContinent(new Scanner(System.in).nextLine());

        System.out.println("Столица:");
        ch.setCapital(new Scanner(System.in).nextLine());

        System.out.println("Страна:");
        ch.setCountry_name(new Scanner(System.in).nextLine());

        new BaseHandler().updateById(ch);
    }
    public static void delete(){
        System.out.println("Введите id:");
        new BaseHandler().deleteById(new Scanner(System.in).nextInt());
    }
}
