import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try {
            read("D:\\4sem\\java\\5\\5.2\\src\\text.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void read(String pathFile) throws IOException {
        String str = Files.lines(Path.of(pathFile), StandardCharsets.UTF_8)
                .collect(Collectors.joining(System.lineSeparator()));
        String[] array0 = str.split(" ");
        List<String> list = Arrays.stream(array0).collect(Collectors.toList());
        System.out.println(Arrays.toString(array0));
        task(list);
    }
    public static void  task(List<String> list){
        String min = list.stream().min(String::compareTo).get();
        String max = list.stream().max(String::compareTo).get();
        System.out.println("1.Минимальный элемент " + min);
        System.out.println("2.Максимальный элемент " + max);

        int minIndexOf = list.indexOf(min);
        int minLastIndex = list.lastIndexOf(min);
        System.out.println("3.Левый индекс первого минимума " + minIndexOf + ", правого " + minLastIndex);

        String[] between = new String[minLastIndex - minIndexOf - 1];

        System.arraycopy(list.toArray(), minIndexOf + 1, between, 0, minLastIndex - minIndexOf - 1);

        int sumOfBetween = Arrays.stream(between).mapToInt(e -> e.length()).sum();
        System.out.println("4.Сумма элементов, расположенным между индексами (" + minIndexOf + "," + minLastIndex + ") равна " + sumOfBetween);

        int countOfBetween = between.length;
        System.out.println("5.Количество элементов, расположенным между индексами (" + minIndexOf + "," + minLastIndex + ") равна " + countOfBetween);

        double averageBetween = Arrays.stream(between).mapToInt(e -> e.length()).average().getAsDouble();
        System.out.println("6.Среднее значение " + averageBetween);

        List<String> decreasingList = list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("7.Убывающий список " + Arrays.toString(decreasingList.toArray()));
        List<String> increasingList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("8.Возрастающий список " + Arrays.toString(increasingList.toArray()));

        List<String> group = list.stream().skip(5).limit(5).collect(Collectors.toList());
        System.out.println("9.Группа из 5 элементов " + Arrays.toString(group.toArray()));

        List<String> fiveMax = decreasingList.stream().limit(5).collect(Collectors.toList());
        System.out.println("10.Пять максимальных чисел " + Arrays.toString(fiveMax.toArray()));

        int amountAfterFive = list.stream().skip(5).mapToInt(t->t.length()).sum();
        System.out.println("11.Сумма элементов после пятого равна" + amountAfterFive);

        int amountSkipThreeBeforeMax = list.stream().skip(3).takeWhile(t->t!=max).mapToInt(t->t.length()).sum();
        System.out.println("12.Пропустить первые 3 элемента и посчитать сумму элементов, пока не достигнем первого максимального: " + amountSkipThreeBeforeMax);

        List<String> lessThenMax = list.stream().filter(t-> t.length()-4 == max.length()).limit(5).collect(Collectors.toList());
        System.out.println("13.Выбрать из массива array0 пять элементов, меньших максимума на 4 " + Arrays.toString(lessThenMax.toArray()));

        List<String> fiveMin = increasingList.stream().limit(5).collect(Collectors.toList());
        System.out.println("14.Выбрать из массива первые 5 наименьших элементов " + Arrays.toString(fiveMin.toArray()));

        List<String> con = Stream.concat(fiveMax.stream(), fiveMin.stream()).collect(Collectors.toList());
        System.out.println("15.Список из пяти максимальных и минимальных элементов " + Arrays.toString(con.toArray()));

        List<String> without = decreasingList.stream().skip(5).collect(Collectors.toList());
        System.out.println("16.Исходный список без 5-ти максимальных " + Arrays.toString(without.toArray()));

        List<String> with = list.stream().distinct().collect(Collectors.toList());
        System.out.println("17.Уникальные элементы " + Arrays.toString(with.toArray()));

        List<String> startsB = list.stream().filter(e -> e.startsWith("Б")).collect(Collectors.toList());
        System.out.println("18.Слова на букву Б " + Arrays.toString(startsB.toArray()));

        List<String> startsNoB = list.stream().filter(e -> !e.startsWith("Б")).collect(Collectors.toList());
        System.out.println("19.Слова не на букву Б " + Arrays.toString(startsNoB.toArray()));
    }


}
