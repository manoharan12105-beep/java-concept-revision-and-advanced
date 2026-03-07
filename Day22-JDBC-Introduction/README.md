# Day 22 — JDBC Introduction

This project demonstrates the basics of **JDBC (Java Database Connectivity)** by connecting a Java application to a MySQL database, inserting records, and retrieving data from a table.

---

## 📌 Concepts Covered

- JDBC Driver setup
- Connecting Java to MySQL
- Executing SQL queries using `Statement`
- Inserting records into a table
- Retrieving records using `ResultSet`
- Iterating through query results

---

## 🗄 Database Setup

```sql
CREATE DATABASE JDBC;
USE JDBC;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);
```

---

## ⚙️ JDBC Workflow

```
Java Program
     ↓
JDBC Driver
     ↓
MySQL Database
```

Steps followed in the program:

1. Load the JDBC driver
2. Establish connection with MySQL
3. Create a `Statement`
4. Insert student records
5. Execute `SELECT` query
6. Read data using `ResultSet`
7. Close the connection

---

## 💻 Java Code

```java
import java.sql.*;

public class JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/JDBC";
        String username = "root";
        String password = "your_password";

        try {

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

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

## 📊 Example Output

```
Connected to database!
Students inserted successfully!

Students Table:
1 Mano 21
2 Doni 22
3 Ravi 23
```

---

## 📚 Key JDBC Classes

| Class | Purpose |
|------|--------|
| `DriverManager` | Manages database connections |
| `Connection` | Represents connection to database |
| `Statement` | Executes SQL queries |
| `ResultSet` | Stores query results |

---

## 🚀 Learning Outcome

After completing this exercise, you understand how to:

- Connect Java applications to MySQL
- Execute SQL queries from Java
- Insert and retrieve data using JDBC
- Process results using `ResultSet`

---
