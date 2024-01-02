import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task();
    }
    public static List<Studies> readFromFile (String path) throws FileNotFoundException {
        List<Studies> lst = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String[] input = scanner.nextLine().split(";");
            lst.add(new Studies(input[0], Stream.of(input[1].split(" ")).mapToInt(Integer::valueOf).toArray()));
            // считываем из файла там где стримы мы строку делим на отдельные подстроки потом каждую из них парсим в инт и превращаем в массив интов
        }
        return lst;
    }

    public static void task(){
        List<Studies> lst = task1();

        task2(lst);

        task3(lst);

        task4(lst);

        task5(lst);

        task6(lst);



    }

    public static List<Studies> task1(){
        List<Studies> lst = new ArrayList<>();
        try {
            lst = readFromFile("D:\\4sem\\java\\zad2\\text.txt"); // ПУТЬ К ФАйлу
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка неправильный путь к файлу или его отсутсвие.");
        }
        System.out.println("Все ученики:");
        lst.forEach(x-> System.out.println(x.toString()));
        return lst;
    }

    public static void task2(List<Studies> lst){
        // сортируем по фамилии
        lst.sort(new Comparator<Studies>() {
            @Override
            public int compare(Studies o1, Studies o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        System.out.println("По фамилии");
        lst.forEach(x-> System.out.println(x.toString()));
    }

    public static void task3(List<Studies> lst){
        //сорт по сумме оценок
        lst.sort(new Comparator<Studies>() {
            @Override
            public int compare(Studies o1, Studies o2) {
                return Integer.compare(o1.getSumMarks(), o2.getSumMarks());
            }
        });
        System.out.println("По сумме баллов");
        lst.forEach(x-> System.out.println(x.toString()));
    }

    public static void task4(List<Studies> lst){
        lst.sort(new Comparator<Studies>() {
            @Override
            public int compare(Studies o1, Studies o2) {
                return Integer.compare(o1.getSumMarks(), o2.getSumMarks());
            }
        });
        System.out.println("Три лучших");
        lst.stream().limit(3).forEach(x-> System.out.println(x.toString()));
    }

    public static void task5(List<Studies> lst){
        lst = lst.stream().sorted(new Comparator<Studies>() {
            @Override
            public int compare(Studies o1, Studies o2) {
                return Integer.compare(o2.getSumMarks(), o1.getSumMarks());
            }
        }).toList();
        System.out.println("По убыванию суммы баллов");
        lst.forEach(x-> System.out.println(x.toString()));
    }

    public static void task6(List<Studies> lst){
        lst = lst.stream().sorted(new Comparator<Studies>() {
            @Override
            public int compare(Studies o1, Studies o2) {
                return Integer.compare(o2.getSumMarks(), o1.getSumMarks());
            }
        }).toList();
        System.out.println("Три худших");
        lst.stream().limit(3).forEach(x-> System.out.println(x.toString()));
    }



}
