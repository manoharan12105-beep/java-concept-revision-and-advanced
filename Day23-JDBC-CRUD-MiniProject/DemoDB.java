import java.util.*;
import java.sql.*;

public class DemoDB{
  static Connection connection;
  static Statement stmt;
  public static void main(String[] args){
    String url="jdbc:mysql://localhost:3306/";
    String username="root";
    String password="mano123456";

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      connection=DriverManager.getConnection(url,username,password);
      stmt=connection.createStatement();

      stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS StudentDB");
      stmt.executeUpdate("USE StudentDB");

      stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students(id INT PRIMARY KEY,name VARCHAR(50),age INT)");

      Scanner scanner = new Scanner(System.in);

      while(true){

        System.out.println("\n1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");

        int choice=scanner.nextInt();

        switch(choice){
          case 1:insertStudent(scanner);break;
          case 2:viewStudents();break;
          case 3:updateStudent(scanner);break;
          case 4:deleteStudent(scanner);break;
          case 5:return;
        }
      }
    }

    catch(Exception e){
      e.printStackTrace();
    }
  }

  static void insertStudent(Scanner scanner)throws Exception{
    System.out.print("Enter ID: ");
    int id=scanner.nextInt();

    scanner.nextLine();

    System.out.print("Enter Name: ");
    String name=scanner.nextLine();

    System.out.print("Enter Age: ");
    int age=scanner.nextInt();

    stmt.executeUpdate("INSERT INTO students VALUES("+id+",'"+name+"',"+age+")");

    System.out.println("Student Added!");
  }

  static void viewStudents()throws Exception{
    ResultSet rs=stmt.executeQuery("SELECT * FROM students");

    while(rs.next()){

      System.out.println(
        rs.getInt("id")+" | "+
        rs.getString("name")+" | "+
        rs.getInt("age")
      );
    }
  }

  static void updateStudent(Scanner scanner)throws Exception{
    System.out.print("Enter ID to update: ");
    int id=scanner.nextInt();

    System.out.print("Enter new Age: ");
    int age=scanner.nextInt();

    stmt.executeUpdate("UPDATE students SET age="+age+" WHERE id="+id);

    System.out.println("Student Updated!");
  }

  static void deleteStudent(Scanner scanner)throws Exception{
    System.out.print("Enter ID to delete: ");
    int id=scanner.nextInt();

    stmt.executeUpdate("DELETE FROM students WHERE id="+id);

    System.out.println("Student Deleted!");
  }
}

/* OUTPUT

  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  1
  Enter ID: 1
  Enter Name: Kirubakaran
  Enter Age: 20
  Student Added!
  
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  1
  Enter ID: 2
  Enter Name: Nithish Kumar
  Enter Age: 19
  Student Added!
  
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  1
  Enter ID: 3
  Enter Name: Nikil
  Enter Age: 19
  Student Added!
  
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  1
  Enter ID: 4
  Enter Name: Doni
  Enter Age: 20
  Student Added!
  
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  1
  Enter ID: 5 
  Enter Name: Manikandan
  Enter Age: 20
  Student Added!
  
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  1
  Enter ID: 6
  Enter Name: Manoharan
  Enter Age: 20
  Student Added!
  
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  2
  1 | Kirubakaran | 20
  2 | Nithish Kumar | 19
  3 | Nikil | 19
  4 | Doni | 20
  5 | Manikandan | 20
  6 | Manoharan | 20
  
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  3
  Enter ID to update: 2
  Enter new Age: 21
  Student Updated!
  
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  2
  1 | Kirubakaran | 20
  2 | Nithish Kumar | 21
  3 | Nikil | 19
  4 | Doni | 20
  5 | Manikandan | 20
  6 | Manoharan | 20
  
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  4
  Enter ID to delete: 6
  Student Deleted!
  
  1. Add Student
  2. View Students
  3. Update Student
  1. Add Student
  2. View Students
  3. Update Student
  4. Delete Student
  5. Exit
  
  4
  Enter ID to delete: 6
  Student Deleted!
  
  1. Add Student
  2. View Students
  3. Update Student
  5. Exit
  
  4
  Enter ID to delete: 6
  Student Deleted!

*/
