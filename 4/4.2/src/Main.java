import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task();
    }
    public static void task(){
        DirectoryArr dir = new DirectoryArr();
        try {
            dir.readFromFile("D:\\4sem\\java\\4\\4.2\\src\\information");
        }
        catch (Exception ex){
            System.out.println("File not found!!!");
        }

        menu(dir);
    }
    public static void menu(DirectoryArr dir){
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
        boolean exit = false;
        while (!exit){
            try {
                textMenu();
                Scanner scanner = new Scanner(System.in);
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        dir.print();
                        break;
                    case 2:
                        System.out.println("Введите время(2р раза)");
                        dir.search(formatter.parse(scanner.nextLine()), formatter.parse(scanner.nextLine()));
                        break;
                    case 3:
                        dir.sort();
                        break;
                    case 4:
                        dir.add(new Directory(scanner.nextLine(),formatter.parse(scanner.nextLine()), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
                        break;
                    case 5:
                        dir.add(new Directory(scanner.nextLine(), formatter.parse(scanner.nextLine()), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()), scanner.nextInt());
                        break;
                    case 6:
                        dir.deleteByIndex(scanner.nextInt());
                        break;
                    case 7:
                        dir.changeByIndex(scanner.nextInt(), new Directory(scanner.nextLine(), formatter.parse(scanner.nextLine()), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
                        break;
                    case 8:
                        try {
                            dir.saveToFile("D:\\4sem\\java\\4\\4.2\\src\\info");
                        } catch (Exception ex) {

                        }
                        break;
                }
            }
            catch (Exception ex){
                System.out.println("");
            }
        }
    }
    public static void textMenu(){
        System.out.println("1.Вывод данных");
        System.out.println("2.Поиск");
        System.out.println("3.Сортировка");
        System.out.println("4.Добавление в конец массива");
        System.out.println("5.Вставка новой записи после указанного номера существующей записи");
        System.out.println("6.Удаление записи с указанным номером");
        System.out.println("7.Редактирование записи с указанным номером");
        System.out.println("8.Сохранить данные в источник данных");
    }

}
