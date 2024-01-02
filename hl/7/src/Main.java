import BaseClasses.*;
import BaseHandlers.SQLiteHandler;
import FileClasses.FileWorker;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        boolean exit = false;
        while (!exit){
            try{
                System.out.println("1.Считать данные из txt");
                System.out.println("2.Сохранить данные в txt");
                System.out.println("3.Показать данные");
                System.out.println("4.Показать запросы");
                System.out.println("5.Выход");
                int choice = new Scanner(System.in).nextInt();
                switch (choice) {
                    case 1 -> readFromTxt();
                    case 2 -> saveToTxt();
                    case 3 -> showAllInformation();
                    case 4 -> showRequests();
                    case 5 -> exit = true;
                    default -> System.out.println("Вы ввели неверные данные");
                }
            }
            catch (Exception e){
                System.out.println("Вы ввели неверные данные");
            }

        }
    }
    private static void showAllInformation(){
        SQLiteHandler handler = new SQLiteHandler();

        System.out.println("Кассеты");
        handler.getAllCassette().forEach(x-> System.out.println(x.toString()));

        System.out.println("Жанры");
        handler.getAllGenres().forEach(x-> System.out.println(x.toString()));

        System.out.println("Сотрудники");
        handler.getAllWorkers().forEach(x-> System.out.println(x.toString()));

        System.out.println("Должности");
        handler.getAllPositions().forEach(x-> System.out.println(x.toString()));

        System.out.println("Клиенты");
        handler.getAllClients().forEach(x-> System.out.println(x.toString()));

        System.out.println("Заказы");
        handler.getAllOrders().forEach(x-> System.out.println(x.toString()));

    }
    private static void showRequests(){
        SQLiteHandler handler = new SQLiteHandler();

        System.out.println("Запрос 1:");
        System.out.println(handler.request1());

        System.out.println("Запрос 2:");
        System.out.println(handler.request2());

        System.out.println("Запрос 3:");
        System.out.println(handler.request3());

        System.out.println("Запрос 4:");
        System.out.println("Введите наименование:");
        System.out.println(handler.request4(new Scanner(System.in).nextLine()));

        System.out.println("Запрос 5:");
        System.out.println("Введите жанр:");
        System.out.println(handler.request5(new Scanner(System.in).nextLine()));

        System.out.println("Запрос 6:");
        System.out.println(handler.request7());

        System.out.println("Запрос 7:");
        Client client = new Client();
        System.out.println("ФИО:");
        client.setFullName(new Scanner(System.in).nextLine());
        System.out.println("Адрес:");
        client.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Паспортные данные:");
        client.setPassport(new Scanner(System.in).nextLine());
        System.out.println("Телефон:");
        client.setPhoneNumber(new Scanner(System.in).nextLine());
        handler.request8(client);

        System.out.println("Запрос 8:");
        System.out.println("id:");
        int id = new Scanner(System.in).nextInt();
        System.out.println("ФИО:");
        client.setFullName(new Scanner(System.in).nextLine());
        System.out.println("Адрес:");
        client.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Паспортные данные:");
        client.setPassport(new Scanner(System.in).nextLine());
        System.out.println("Телефон:");
        client.setPhoneNumber(new Scanner(System.in).nextLine());
        handler.request9(client, id);

        System.out.println("Запрос 9:");
        System.out.println("id:");
        handler.request10(new Scanner(System.in).nextInt());
    }
    private static void saveToTxt() throws FileNotFoundException {
        SQLiteHandler handler = new SQLiteHandler();
        FileWorker fw = new FileWorker();
        fw.saveCassettes("D:\\4sem\\java\\7\\src\\txtFiles\\Кассеты.txt", handler.getAllCassette());
        fw.saveWorkers("D:\\4sem\\java\\7\\src\\txtFiles\\Сотрудники.txt", handler.getAllWorkers());
        fw.saveGenres("D:\\4sem\\java\\7\\src\\txtFiles\\Жанры.txt", handler.getAllGenres());
        fw.saveOrders("D:\\4sem\\java\\7\\src\\txtFiles\\Заказ.txt", handler.getAllOrders());
        fw.savePosition("D:\\4sem\\java\\7\\src\\txtFiles\\Должности.txt", handler.getAllPositions());
        fw.saveClients("D:\\4sem\\java\\7\\src\\txtFiles\\Клиенты.txt", handler.getAllClients());
    }
    private static void readFromTxt() throws  FileNotFoundException{
        FileWorker fw = new FileWorker();
        SQLiteHandler handler = new SQLiteHandler();
        List<Cassette> cassettes = fw.readCassettes("D:\\4sem\\java\\7\\src\\txtFiles\\Кассеты.txt");
        handler.addCassettes(cassettes);
        List<Client> clients = fw.readClients("D:\\4sem\\java\\7\\src\\txtFiles\\Клиенты.txt");
        handler.addClients(clients);
        List<Genre> genres = fw.readGenres("D:\\4sem\\java\\7\\src\\txtFiles\\Жанры.txt");
        handler.addGenres(genres);
        List<Order> orders = fw.readOrders("D:\\4sem\\java\\7\\src\\txtFiles\\Заказ.txt");
        handler.addOrders(orders);
        List<Position> positions = fw.readPosition("D:\\4sem\\java\\7\\src\\txtFiles\\Должности.txt");
        handler.addPosition(positions);
        List<Worker> workers = fw.readWorkers("D:\\4sem\\java\\7\\src\\txtFiles\\Сотрудники.txt");
        handler.addWorkers(workers);
    }
}
