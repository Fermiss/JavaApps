import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HandbookArray {
    private List<AgronomistHandbook> array;

    public AgronomistHandbook get(int i){
        return array.get(i);
    }

    public List<AgronomistHandbook> search(int find){
        sort();
        return array.stream().filter(x-> x.getApplicationRate() == find).toList();
    }

    public void add(AgronomistHandbook handbook) {
        array.add(handbook);
    }

    public void add(AgronomistHandbook handbook, int pos){
        array.add(pos, handbook);
    }

    public void delete(int pos){
        array.remove(pos);
    }

    public void change(int pos, AgronomistHandbook handbook){
        array.set(pos, handbook);
    }

    public void sort(){
        array.sort(new Comparator<AgronomistHandbook>() {
            @Override
            public int compare(AgronomistHandbook o1, AgronomistHandbook o2) {
                return Integer.compare(o1.getApplicationRate(), o2.getApplicationRate());
            }
        });
    }

    public void printAll(){
        array.forEach(x-> System.out.println(x.toString()));
    }

    public void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String[] line = scanner.nextLine().split(";");
            add(new AgronomistHandbook(line[0],line[1],Integer.parseInt(line[2]),Integer.parseInt(line[3]),Integer.parseInt(line[4])));
        }
    }

    public void saveFile(String path) throws FileNotFoundException {
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        array.forEach(x-> pw.println(x.toString()));
        pw.close();
    }
}

