import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Demo";
        String username = "root";
        String password = "mano123456";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");   // load driver

            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to the database successfully!");

            connection.close();

        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}


//Output : Connected to the database successfully!
