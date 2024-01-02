import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class DirectoryArr {
    private Directory[] array;
    public Directory get(int i) {
        return array[i];
    }
    public void search(Date start, Date end){
        Arrays.stream(array).filter(x-> x.getTime().compareTo(start) >= 0 &&
                x.getTime().compareTo(end) <= 0).forEach(x-> System.out.println(x));
    }
    public void add(Directory directory){
        if (array!= null) {
            Directory[] newArr = Arrays.copyOf(array, array.length + 1);
            newArr[array.length] = directory;
            array = newArr;
        }
        else {
            array = new Directory[1];
            array[0] = new Directory(directory);
        }
    }
    public void add(Directory directory, int pos){
        if (array != null) {
            Directory[] newArr = new Directory[array.length+1];
            System.arraycopy(array, 0, newArr, 0, pos);
            newArr[pos] = new Directory(directory);
            System.arraycopy(array, pos, newArr, pos+1, array.length-pos);
            array = newArr;
        }
    }
    public void deleteByIndex(int pos){
        Directory[] newArr = new Directory[array.length-1];
        System.arraycopy(array, 0, newArr, 0, pos);
        System.arraycopy(array, pos+1, newArr, pos, array.length-pos-1);
        array = newArr;
    }
    public void changeByIndex(int pos, Directory directory){
        array[pos] = new Directory(directory);
    }
    public void sort(){
        Arrays.sort(array, new Comparator<Directory>() {
            @Override
            public int compare(Directory o1, Directory o2) {
                return o1.getEvent().compareTo(o2.getEvent());
            }
        });
    }
    public void readFromFile(String path) throws FileNotFoundException, ParseException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
        while(scanner.hasNextLine()){
            String[] inputData = scanner.nextLine().split(";");
            add(new Directory(inputData[4],formatter.parse(inputData[3]) ,inputData[2],inputData[0],inputData[1]));
        }
        scanner.close();
    }
    public void saveToFile(String path) throws FileNotFoundException{
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < array.length; i++) {
            pw.println(array[i].toString());
        }
        pw.close();
    }
    public void print(){
        Arrays.stream(array).forEach(x-> System.out.println(x.toString()));
    }
}
