import java.sql.*;

public class JDBC{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/JDBC";
        String username = "root";
        String password = "mano123456";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");

            Statement stmt = connection.createStatement();
            String insertQuery1 = "INSERT INTO students VALUES (1, 'Mano', 21)";
            String insertQuery2 = "INSERT INTO students VALUES (2, 'Doni', 22)";
            String insertQuery3 = "INSERT INTO students VALUES (3, 'Ravi', 23)";
            stmt.executeUpdate(insertQuery1);
            stmt.executeUpdate(insertQuery2);
            stmt.executeUpdate(insertQuery3);
            System.out.println("Students inserted successfully!");

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            System.out.println("\nStudents Table:");
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + " " + name + " " + age);
            }
            connection.close();
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
}



/*
Output :

Connected to database!
Students inserted successfully!

Students Table:
1 Mano 21
2 Doni 22
3 Ravi 23

*/
