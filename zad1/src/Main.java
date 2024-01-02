import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = task1();

        task2(words);

        task3(words);


    }

    public static List<String> readFromFile(String path){
        List<String> words2 = new ArrayList<>();
        List<String> words = new ArrayList<>(); // лист стрингов
        try {
            // чтение из файла
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String[] inputData = scanner.nextLine().split(" ");
                for (int i = 0; i < inputData.length; i++) {
                    words.add(inputData[i].toLowerCase(Locale.ROOT)); // добавление в колекцию слов из файла
                    words2.add(inputData[i]);
                }
            }
        }catch (Exception e){
            System.out.println("Ошибка, невернао указан путь к файлу:");
        }
        listToString(words2);

        return words;
    }


    public static void task2(List<String> words){
        words = words.stream().filter(x-> x.length()> 3).toList();// фильтруем нашу коллекцию через стри апи
        listToString(words);
    }

    public static void task3(List<String> words){
        words = words.stream().distinct().toList(); // убираем одинаковые элементы из коллекции
        System.out.println("Кол-во уникальных слов: " + words.size());
    }

    public static List<String> task1(){
        return readFromFile("D:\\4sem\\java\\zad1\\src\\ind.txt");
    }
    public static void listToString(List<String> lst){
        System.out.println(lst.toString());
    }
}
