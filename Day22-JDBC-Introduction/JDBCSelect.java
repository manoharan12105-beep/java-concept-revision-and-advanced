import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Demo";
        String username = "root";
        String password = "mano123456";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");   // load driver

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while(rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age")
                );
            }

            connection.close();

        } 
        catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}

/*
Output : 

1 Mano 21
2 Doni 22

*/
