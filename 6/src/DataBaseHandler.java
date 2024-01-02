import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseHandler {

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        return DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
    }

    public List<Chemical_elements> getAllElements() {
        String select = "SELECT * FROM chemical_elements ORDER BY atom_height";
        List<Chemical_elements> lst = new ArrayList<Chemical_elements>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet resultSet = prSt.executeQuery();
            while (resultSet.next()) {
               lst.add(new Chemical_elements(
                       resultSet.getString("name"),
                       resultSet.getInt("atom_height"),
                       resultSet.getInt("valence"),
                       resultSet.getDouble("density"),
                       resultSet.getString("color"),
                       resultSet.getInt("id")));
            }
            prSt.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lst;
    }
    public void deleteById(int id){
        String delete = "DELETE FROM chemical_elements WHERE id="+id;
        try {
            Statement prSt = getDbConnection().createStatement();
            prSt.execute(delete);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void updateById(Chemical_elements el){
        String update = "UPDATE chemical_elements SET name=? ,valence=?,density=?, color=?, atom_height=? WHERE id =?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(update);
            prSt.setString(1,el.getName());
            prSt.setInt(2,el.getValence());
            prSt.setDouble(3, el.getDensity());
            prSt.setString(4, el.getColor());
            prSt.setInt(5, el.getAtom_height());
            prSt.setInt(6, el.getId());
            prSt.executeUpdate();
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public void insertChemical_element(Chemical_elements el){
        String insert = "INSERT INTO chemical_elements (name, valence, density, color, atom_height) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, el.getName());
            prSt.setInt(2, el.getValence());
            prSt.setDouble(3, el.getDensity());
            prSt.setString(4, el.getColor());
            prSt.setInt(5, el.getAtom_height());
            prSt.executeUpdate();
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public Chemical_elements searchElementByName(String name){
        String select = "SELECT * from chemical_elements WHERE name=?";
        Chemical_elements el = new Chemical_elements();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, name);
            ResultSet resultSet = prSt.executeQuery();
            if(resultSet.next()) {
                el.setId(resultSet.getInt("id"));
                el.setName(resultSet.getString("name"));
                el.setValence(resultSet.getInt("valence"));
                el.setColor(resultSet.getString("color"));
                el.setDensity(resultSet.getDouble("density"));
                el.setAtom_height(resultSet.getInt("atom_height"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return el;
    }
}
