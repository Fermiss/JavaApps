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
                System.out.println("4.Удаление записи с указанным номером");
                System.out.println("5.Редактирование записи с указанным номером");
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
        System.out.println("Введите Наименование:");
        System.out.println(new DataBaseHandler().searchElementByName(new Scanner(System.in).nextLine()).toString());
    }
    public static void showElements(){
        List<Chemical_elements> lst = new DataBaseHandler().getAllElements();
        System.out.println("===================================");
        lst.forEach(x -> System.out.println(x.toString()));
        System.out.println("===================================");
    }
    public static void addElement(){
        Chemical_elements el = new Chemical_elements();
        System.out.println("Наименование:");
        el.setName(new Scanner(System.in).nextLine());
        System.out.println("Плотность:");
        el.setDensity(new Scanner(System.in).nextDouble());
        System.out.println("Валентность:");
        el.setValence(new Scanner(System.in).nextInt());
        System.out.println("Атомный вес:");
        el.setAtom_height(new Scanner(System.in).nextInt());
        System.out.println("Цвет:");
        el.setColor(new Scanner(System.in).nextLine());
        new DataBaseHandler().insertChemical_element(el);
    }
    public static void updateElement(){
        Chemical_elements ch = new Chemical_elements();
        System.out.println("Введите id:");
        ch.setId(new Scanner(System.in).nextInt());
        System.out.println("Наименование:");
        ch.setName(new Scanner(System.in).nextLine());
        System.out.println("Плотность:");
        ch.setDensity(new Scanner(System.in).nextDouble());
        System.out.println("Валентность:");
        ch.setValence(new Scanner(System.in).nextInt());
        System.out.println("Атомный вес:");
        ch.setAtom_height(new Scanner(System.in).nextInt());
        System.out.println("Цвет:");
        ch.setColor(new Scanner(System.in).nextLine());
        new DataBaseHandler().updateById(ch);
    }
    public static void delete(){
        System.out.println("Введите id:");
        new DataBaseHandler().deleteById(new Scanner(System.in).nextInt());
    }
}
