import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Demo";
        String username = "root";
        String password = "mano123456";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");   // load driver

            Connection connection = DriverManager.getConnection(url, username, password);

            String query1 = "INSERT INTO students VALUES (1, 'Mano', 21)";
            String query2 = "INSERT INTO students VALUES (2, 'Doni', 22)";

            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);

            System.out.println("Student inserted successfully!");

            connection.close();

        } 
        catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}

//Output : Student inserted successfully!
