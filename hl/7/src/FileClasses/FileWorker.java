package FileClasses;

import BaseClasses.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWorker {
    public void saveGenres(String path, List<Genre> lst) throws FileNotFoundException {
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        lst.forEach(x-> pw.println(x.toString()));
        pw.close();
    }

    public void saveOrders(String path, List<Order> lst) throws FileNotFoundException {
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        lst.forEach(x-> pw.println(x.toString()));
        pw.close();
    }

    public void savePosition(String path, List<Position> lst) throws FileNotFoundException {
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        lst.forEach(x-> pw.println(x.toString()));
        pw.close();
    }

    public void saveCassettes(String path, List<Cassette> lst) throws FileNotFoundException{
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        lst.forEach(x-> pw.println(x.toString()));
        pw.close();
    }

    public void saveClients(String path, List<Client> lst) throws FileNotFoundException {
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        lst.forEach(x-> pw.println(x.toString()));
        pw.close();
    }

    public void saveWorkers(String path, List<Worker> lst) throws FileNotFoundException{
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        lst.forEach(x-> pw.println(x.toString()));
        pw.close();
    }

    public List<Genre> readGenres(String path) throws FileNotFoundException {
        List<Genre> lst = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String[] inputData = scanner.nextLine().split(" ");
            lst.add(new Genre(Integer.parseInt(inputData[0]),inputData[1],inputData[2]));
        }
        scanner.close();
        return lst;
    }

    public List<Order> readOrders(String path) throws FileNotFoundException {
        List<Order> lst = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String[] inputData = scanner.nextLine().split(" ");
            lst.add(new Order(Integer.parseInt(inputData[0]),
                    Integer.parseInt(inputData[1]),
                    Integer.parseInt(inputData[2]),
                    Integer.parseInt(inputData[3]),
                    inputData[4],
                    inputData[5]));
        }
        scanner.close();
        return lst;
    }

    public List<Position> readPosition(String path) throws FileNotFoundException {
        List<Position> lst = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String[] inputData = scanner.nextLine().split(" ");
            lst.add(new Position(Integer.parseInt(inputData[0]),
                    inputData[1],
                    Integer.parseInt(inputData[2]),
                    inputData[3],
                    inputData[4]));
        }
        scanner.close();
        return lst;
    }

    public List<Cassette> readCassettes(String path) throws FileNotFoundException {
        List<Cassette> lst = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String[] inputData = scanner.nextLine().split(" ");
            lst.add(new Cassette(
                    Integer.parseInt(inputData[0]),
                    inputData[1],
                    Integer.parseInt(inputData[2]),
                    inputData[3],
                    inputData[4],
                    inputData[5],
                    Integer.parseInt(inputData[6]),
                    Integer.parseInt(inputData[7])));
        }
        scanner.close();
        return lst;
    }

    public List<Client> readClients(String path) throws FileNotFoundException {
        List<Client> lst = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String[] inputData = scanner.nextLine().split(" ");
            lst.add(new Client(
                    Integer.parseInt(inputData[0]),
                    inputData[1],
                    inputData[2],
                    inputData[3],
                    inputData[4]
            ));
        }
        scanner.close();
        return lst;
    }

    public List<Worker> readWorkers(String path) throws FileNotFoundException {
        List<Worker> lst = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String[] inputData = scanner.nextLine().split(" ");
            lst.add(new Worker(
                    Integer.parseInt(inputData[0]),
                    inputData[1],
                    Integer.parseInt(inputData[2]),
                    inputData[3],
                    inputData[4],
                    inputData[5],
                    inputData[6],
                    Integer.parseInt(inputData[7])
            ));
        }
        scanner.close();
        return lst;
    }
}
