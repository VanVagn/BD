import org.postgresql.util.PSQLException;

import java.sql.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {


            String url = "jdbc:postgresql://localhost:5432/training_hw_5";
            String user = "postgres";
            String password = "Alex1508";


            try {
                Connection connection = DriverManager.getConnection(url, user, password);

                Statement statement = connection.createStatement();
                String sql = "SELECT * FROM audit_department"; // SQL-запрос для выборки данных из таблицы
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    String id = resultSet.getString("revisionNumber");
                    String name = resultSet.getString("productType");
                    String age = resultSet.getString("locationAddress");

                    System.out.println("revisionNumber: " + id + ", productType: " + name + ", locationAddress: " + age);
                }

                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
}

