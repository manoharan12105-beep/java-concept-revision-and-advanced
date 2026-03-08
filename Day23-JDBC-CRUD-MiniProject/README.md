# Day 23 — JDBC CRUD Operations

This project demonstrates basic **CRUD operations (Create, Read, Update, Delete)** using **Java JDBC and MySQL**.

The program creates a database, creates a table if it does not exist, and allows the user to manage student records through a console menu.

---

## Features

- Create database using JDBC
- Create table using JDBC
- Insert student records
- View all students
- Update student age
- Delete student record
- Menu-driven console program

---

## Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL

---

## Database Schema

```
students
--------
id   INT PRIMARY KEY
name VARCHAR(50)
age  INT
```

---

## Menu

```
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
```

---

## Example Output

```
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

1
Enter ID: 1
Enter Name: Manoharan
Enter Age: 20
Student Added!

2
1 | Manoharan | 20
```

---

## Concepts Practiced

- JDBC Driver Loading
- Database Connection
- SQL Execution using `Statement`
- ResultSet Processing
- CRUD Operations in Java
- Exception Handling

---

## Learning Outcome

This project helped understand how Java applications interact with databases using JDBC and perform basic data operations.

