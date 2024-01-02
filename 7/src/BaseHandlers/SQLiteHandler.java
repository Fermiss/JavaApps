package BaseHandlers;

import BaseClasses.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLiteHandler {
    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        return DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
    }
    public List<Cassette> getAllCassette() {
        String select = "SELECT * from Кассеты";
        List<Cassette> lst = new ArrayList<Cassette>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                lst.add(new Cassette(
                        resultSet.getInt("Код кассеты"),
                        resultSet.getString("Наименование кассеты"),
                        resultSet.getInt("Год создания"),
                        resultSet.getString("Производитель"),
                        resultSet.getString("Страна"),
                        resultSet.getString("Режиссёр"),
                        resultSet.getInt("Код жанра"),
                        resultSet.getInt("Цена")));
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lst;
    }

    public List<Client> getAllClients(){
        String select = "SELECT * from Клиенты";
        List<Client> lst = new ArrayList<Client>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                lst.add(new Client(
                        resultSet.getInt("Код клиента"),
                        resultSet.getString("ФИО"),
                        resultSet.getString("Адрес"),
                        resultSet.getString("Паспортные данные"),
                        resultSet.getString("Телефон")));
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lst;
    }

    public List<Genre> getAllGenres(){
        String select = "SELECT * from Жанры";
        List<Genre> lst = new ArrayList<Genre>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                lst.add(new Genre(
                        resultSet.getInt("Код жанра"),
                        resultSet.getString("Наименование жанра"),
                        resultSet.getString("Описание")));
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lst;
    }

    public List<Position> getAllPositions(){
        String select = "SELECT * from Должности";
        List<Position> lst = new ArrayList<Position>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                lst.add(new Position(
                        resultSet.getInt("Код должности"),
                        resultSet.getString("Наименование"),
                        resultSet.getInt("Оклад"),
                        resultSet.getString("Обязанности"),
                        resultSet.getString("Требования")));
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lst;
    }

    public List<Worker> getAllWorkers(){
        String select = "SELECT * from Сотрудники";
        List<Worker> lst = new ArrayList<Worker>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                lst.add(new Worker(
                        resultSet.getInt("Код сотрудника"),
                        resultSet.getString("ФИО"),
                        resultSet.getInt("Возраст"),
                        resultSet.getString("Пол"),
                        resultSet.getString("Адрес"),
                        resultSet.getString("Телефон"),
                        resultSet.getString("Паспортные данные"),
                        resultSet.getInt("Код должности")));
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lst;
    }

    public List<Order> getAllOrders(){
        String select = "SELECT * from Заказ";
        List<Order> lst = new ArrayList<Order>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                lst.add(new Order(
                        resultSet.getInt("Код заказа"),
                        resultSet.getInt("Код клиента"),
                        resultSet.getInt("Код сотрудника"),
                        resultSet.getInt("Код кассеты"),
                        resultSet.getString("Дата получения"),
                        resultSet.getString("Дата возврата")));
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lst;
    }

    public void addCassettes(List<Cassette> lst){
        String deleteAll = "DELETE FROM Кассеты WHERE \"Код кассеты\" !=0";
        String insert = "INSERT INTO Кассеты (\"Наименование кассеты\", \"Год создания\", Производитель, Страна, Режиссёр, \"Код жанра\", Цена) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteAll);
            prSt.execute();
            prSt.close();
            PreparedStatement prSt2 = getDbConnection().prepareStatement(insert);
            for (int i = 0; i < lst.size(); i++) {
                prSt2.setString(1, lst.get(i).getName());
                prSt2.setInt(2,lst.get(i).getYear());
                prSt2.setString(3,lst.get(i).getMaker());
                prSt2.setString(4,lst.get(i).getCountry());
                prSt2.setString(5,lst.get(i).getProducer());
                prSt2.setInt(6,lst.get(i).getGenre_id());
                prSt2.setInt(7,lst.get(i).getPrice());
                prSt2.executeUpdate();
            }
            prSt2.close();
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void addClients(List<Client> lst){
        String deleteAll = "DELETE FROM Клиенты WHERE \"Код клиента\" !=0";
        String insert = "INSERT INTO Клиенты (ФИО, Адрес, \"Паспортные данные\", Телефон) VALUES (?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteAll);
            prSt.execute();
            prSt.close();
            PreparedStatement prSt2 = getDbConnection().prepareStatement(insert);
            for (int i = 0; i < lst.size(); i++) {
                prSt2.setString(1, lst.get(i).getFullName());
                prSt2.setString(2,lst.get(i).getAddress());
                prSt2.setString(3,lst.get(i).getPassport());
                prSt2.setString(4,lst.get(i).getPhoneNumber());
                prSt2.executeUpdate();
            }
            prSt2.close();
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void addGenres(List<Genre> lst){
        String deleteAll = "DELETE FROM Жанры where \"Код жанра\" !=0";
        String insert = "INSERT INTO Жанры (\"Наименование жанра\", Описание) VALUES (?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteAll);
            prSt.execute();
            prSt.close();
            PreparedStatement prSt2 = getDbConnection().prepareStatement(insert);
            for (int i = 0; i < lst.size(); i++) {
                prSt2.setString(1, lst.get(i).getName());
                prSt2.setString(2,lst.get(i).getDescription());
                prSt2.executeUpdate();
            }
            prSt2.close();
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void addPosition(List<Position> lst){
        String deleteAll = "DELETE FROM Должности WHERE \"Код должности\" != 0; ";
        String insert = "INSERT INTO Должности (Наименование, Оклад, Обязанности, Требования) VALUES (?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteAll);
            prSt.execute();
            prSt.close();
            PreparedStatement prSt2 = getDbConnection().prepareStatement(insert);
            for (int i = 0; i < lst.size(); i++) {
                prSt2.setString(1, lst.get(i).getName());
                prSt2.setInt(2,lst.get(i).getSalary());
                prSt2.setString(3,lst.get(i).getRequirements());
                prSt2.setString(4,lst.get(i).getResponsibilities());
                prSt2.executeUpdate();
            }
            prSt2.close();
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void addWorkers(List<Worker> lst){
        String deleteAll = "DELETE FROM Сотрудники WHERE \"Код сотрудника\" != 0";
        String insert = "INSERT INTO Сотрудники (ФИО, Возраст, Пол, Адрес, Телефон, \"Паспортные данные\", \"Код должности\") VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteAll);
            prSt.execute();
            prSt.close();
            PreparedStatement prSt2 = getDbConnection().prepareStatement(insert);
            for (int i = 0; i < lst.size(); i++) {
                prSt2.setString(1, lst.get(i).getFullName());
                prSt2.setInt(2,lst.get(i).getAge());
                prSt2.setString(3,lst.get(i).getSex());
                prSt2.setString(4,lst.get(i).getAddress());
                prSt2.setString(5,lst.get(i).getPhoneNumber());
                prSt2.setString(6,lst.get(i).getPassport());
                prSt2.setInt(7,lst.get(i).getPosition_id());
                prSt2.executeUpdate();
            }
            prSt2.close();
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void addOrders(List<Order> lst){
        String deleteAll = "DELETE FROM Заказ where \"Код заказа\" != 0";
        String insert = "INSERT INTO Заказ (\"Код заказа\",\"Код клиента\", \"Код сотрудника\", \"Код кассеты\", \"Дата получения\", \"Дата возврата\") VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteAll);
            prSt.execute();
            prSt.close();
            PreparedStatement prSt2 = getDbConnection().prepareStatement(insert);
            for (int i = 0; i < lst.size(); i++) {
                prSt2.setInt(1, lst.get(i).getId());
                prSt2.setInt(2,lst.get(i).getClient_id());
                prSt2.setInt(3,lst.get(i).getWorker_id());
                prSt2.setInt(4,lst.get(i).getCassette_id());
                prSt2.setString(5,lst.get(i).getStartDate());
                prSt2.setString(6,lst.get(i).getEndDate());
                prSt2.executeUpdate();
            }
            prSt2.close();
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public String request1(){
        String select = "SELECT Сотрудники.ФИО, Сотрудники.Возраст, Сотрудники.Пол, Сотрудники.Телефон, " +
                "Должности.Наименование, Сотрудники.Адрес, Сотрудники.[Паспортные данные]" +
                " FROM Должности INNER JOIN Сотрудники ON Должности.[Код должности] = Сотрудники.[Код должности]";
        StringBuilder str = new StringBuilder();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                str.append(resultSet.getString(1));
                str.append(" ");
                str.append(resultSet.getInt(2));
                str.append(" ");
                str.append(resultSet.getString(3));
                str.append(" ");
                str.append(resultSet.getString(4));
                str.append(" ");
                str.append(resultSet.getString(5));
                str.append(" ");
                str.append(resultSet.getString(6));
                str.append(" ");
                str.append(resultSet.getString(7));
                str.append(" ");
                str.append("\n");
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public String request2(){
        String select ="SELECT Кассеты.[Наименование кассеты],Клиенты.ФИО FROM Клиенты INNER JOIN (Кассеты INNER JOIN Заказ ON Кассеты.[Код кассеты] = Заказ.[Код кассеты]) ON Клиенты.[Код клиента] = Заказ.[Код клиента]";
        StringBuilder str = new StringBuilder();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                str.append(resultSet.getString(1));
                str.append(" ");
                str.append(resultSet.getString(2));
                str.append(" ");
                str.append("\n");
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public String request3(){
        String select = "SELECT Клиенты.ФИО FROM Клиенты " +
                "INNER JOIN Заказ ON Клиенты.[Код клиента] = Заказ.[Код клиента]" +
                " GROUP BY Клиенты.ФИО HAVING (((Count(Заказ.[Код клиента]))>=2));";
        StringBuilder str = new StringBuilder();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                str.append(resultSet.getString(1));
                str.append(" ");
                str.append("\n");
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public String request4(String name){
        String select = "SELECT Сотрудники.ФИО" +
                "FROM Должности INNER JOIN Сотрудники ON Должности.[Код должности] = Сотрудники.[Код должности]" +
                "WHERE Должности.Наименование = ?";
        StringBuilder str = new StringBuilder();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, name);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                str.append(resultSet.getString(1));
                str.append(" ");
                str.append("\n");
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return str.toString();
    }

    public String request5(String genre){
        String select = "SELECT Кассеты.\"Наименование кассеты\"" +
                "FROM Жанры INNER JOIN Кассеты ON Жанры.[Код жанра] = Кассеты.[Код жанра]" +
                "WHERE Жанры.\"Наименование жанра\" = ?";
        StringBuilder str = new StringBuilder();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, genre);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                str.append(resultSet.getString(1));
                str.append(" ");
                str.append("\n");
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public String request6(){
        StringBuilder str = new StringBuilder();
        


        return str.toString();
    }

    public String request7(){
        String select = "SELECT Кассеты.Страна, Count(Кассеты.\"Наименование кассеты\") AS [Count-Наименование фильма]" +
                "FROM Кассеты" +
                "GROUP BY Кассеты.Страна;";
        StringBuilder str = new StringBuilder();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
                str.append(resultSet.getString(1));
                str.append(" ");
                str.append(resultSet.getInt(2));
                str.append("\n");
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public void request8(Client client){
        String insert = "INSERT INTO Клиенты (ФИО, Адрес, \"Паспортные данные\", Телефон) VALUES (?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, client.getFullName());
            prSt.setString(2, client.getAddress());
            prSt.setString(3, client.getPassport());
            prSt.setString(4, client.getPhoneNumber());
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void request9(Client client, int id){
        String select = "UPDATE Клиенты SET ФИО=?, Адрес=?, \"Паспортные данные\"=?, Телефон=? WHERE \"Код клиента\" =?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, client.getFullName());
            prSt.setString(2, client.getAddress());
            prSt.setString(3, client.getAddress());
            prSt.setString(4, client.getPhoneNumber());
            prSt.setInt(5, id);
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void request10(int id) {
        String select = "DELETE FROM Клиенты WHERE \"Код клиента\" =?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setInt(1, id);
            prSt.execute();
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
