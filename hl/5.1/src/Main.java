import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try {
            readFromFile("D:\\4sem\\java\\5\\5.1\\src\\text.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFromFile(String pathFile) throws IOException {
        String str = Files.lines(Path.of(pathFile), StandardCharsets.UTF_8)
                .collect(Collectors.joining(System.lineSeparator()));
        int[] array0 = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        task(array0);
    }
    public static void task(int[] array0){
        System.out.println(Arrays.toString(array0));
        System.out.println("task 1:");
        System.out.println("min: " + Arrays.stream(array0).min().getAsInt());
        System.out.println("max: " + Arrays.stream(array0).max().getAsInt());


        System.out.println("task 2:");
        System.out.println("Index of left min: " + findIndex(array0, Arrays.stream(array0).limit(array0.length/2).min().getAsInt()));
        System.out.println("Index of right min: " + findIndex(array0, Arrays.stream(array0).skip(array0.length/2).min().getAsInt()));


        System.out.println("task 3:");
        int iMin1 = findIndex(array0, Arrays.stream(array0).limit(array0.length/2).min().getAsInt());
        int iMin2 = findIndex(array0, Arrays.stream(array0).skip(array0.length/2).min().getAsInt());
        Arrays.stream(array0)
                .skip(iMin1 + 1)
                .limit(array0.length - iMin1 - 1 - (array0.length - iMin2))
                .forEach(s-> System.out.print(s+" "));


        System.out.println("task 4:");
        System.out.println("\nSum: "+ Arrays.stream(array0)
                .skip(iMin1 + 1)
                .limit(array0.length - iMin1 - 1 - (array0.length - iMin2))
                .sum());


        System.out.println("task 5:");
        System.out.println("Count: "+ Arrays.stream(array0)
                .skip(iMin1 + 1)
                .limit(array0.length - iMin1 - 1 - (array0.length - iMin2))
                .count());


        System.out.println("task 6:");
        System.out.println("Average: "+ Arrays.stream(array0)
                .skip(iMin1 + 1)
                .limit(array0.length - iMin1 - 1 - (array0.length - iMin2))
                .average().getAsDouble());


        System.out.println("task 7:");
        int[] array1 = Arrays.stream(array0).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(array1));


        System.out.println("task 8:");
        int[] array2 = Arrays.stream(array0).sorted().toArray();
        System.out.println(Arrays.toString(array2));


        System.out.println("task 9:");
        System.out.println(Arrays.toString(Arrays.stream(array0)
                .skip(5)
                .limit(5)
                .toArray()));


        System.out.println("task 10:");
        int[] array3 = Arrays.stream(array0).sorted().skip(array0.length - 5).toArray();
        System.out.println(Arrays.toString(array3));


        System.out.println("task 11:");
        System.out.println(Arrays.stream(array0).skip(5).sum());


        System.out.println("task 12:");
        int firstMax = Arrays.stream(array0).findFirst().stream().max().getAsInt();
        System.out.println(Arrays.stream(array0).skip(3).takeWhile(x-> x<firstMax).sum());


        System.out.println("task 13:");
        int k = 10;
        int max = Arrays.stream(array0).max().getAsInt();
        Arrays.stream(array0).filter(x-> x < max - k ).limit(5);


        System.out.println("task 14:");
        int[] array4 = Arrays.stream(array0)
                .sorted()
                .limit(5)
                .toArray();
        System.out.println(Arrays.toString(array4));


        System.out.println("task 15:");
        int[] newArr = IntStream.concat(Arrays.stream(array3), Arrays.stream(array4)).toArray();
        System.out.println(Arrays.toString(newArr));


        System.out.println("task 16:");//1.	Создать массив из исходного, не содержащий элементы массива array3
        System.out.println(Arrays.toString(Arrays.stream(array0).filter(x-> !containsInArray(x, array3)).toArray()));


        System.out.println("task 17:");
        System.out.println(Arrays.toString(Arrays.stream(array0).distinct().toArray()));
    }

    public static int findIndex(int[] arr, int t)
    {
        int len = arr.length;
        return IntStream.range(0, len)
                .filter(i -> t == arr[i])
                .findFirst()
                .orElse(-1);

    }
    public static boolean containsInArray(int x, int[] arr){
        if (IntStream.range(0, arr.length)
                .filter(i -> x == arr[i])
                .findFirst()
                .orElse(-1) != -1){
            return true;
        }
        return false;
    }
}
