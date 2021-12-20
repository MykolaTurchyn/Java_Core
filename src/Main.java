import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/city",
                "root",
                "rootroot");
        List<City> cities = new ArrayList<>();
        PreparedStatement query = connection.prepareStatement("select * from cities");
        ResultSet response = query.executeQuery();
        while (response.next()) {
            int id = response.getInt(1);
            String name = response.getString(2);
            City city = new City(id, name);
            cities.add(city);
        }
        System.out.println(cities);
//        resultSet.next();
//        String name = resultSet.getString(2);
//        System.out.println(name);
//        int id = resultSet.getInt(1);
//        System.out.println(id);


        connection.close();


    }
}
