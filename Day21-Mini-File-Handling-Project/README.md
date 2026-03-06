# Day 21 — Mini File Handling Project

A simple **Java console-based application** that demonstrates file handling by managing student records in a text file.

This project is part of my **Java Concept Revision & Advanced Learning series**.

---

## 📌 Features

- Add student with **auto-increment ID**
- View all students
- Search student **by ID**
- Delete student **by ID**
- Persistent storage using a text file

---

## 🛠 Technologies Used

- Java
- File Handling (FileReader, FileWriter)
- BufferedReader / BufferedWriter
- Scanner

---

## 📂 Project Structure

```
Day21-Mini-File-Handling-Project
│
├── StudentRecordManager.java
└── students.txt
```

---

## ⚙ How the Program Works

Student data is stored inside **students.txt**.

Each record follows this format:

```
ID,Name,Age
```

Example:

```
1,Manoharan M,20
2,Manikandan A,20
3,Nikil R,20
```

The program automatically generates the **next ID** when adding a new student.

---

## 📋 Menu Options

```
1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
```

### 1️⃣ Add Student
Adds a new student record to the file.

Example:
```
Enter name: Manoharan M
Enter age: 20
Student added with ID: 1
```

---

### 2️⃣ View Students
Displays all student records stored in the file.

Example:
```
ID: 1 | Name: Manoharan M | Age: 20
ID: 2 | Name: Manikandan A | Age: 20
```

---

### 3️⃣ Search Student
Searches a student using their **ID**.

Example:
```
Enter student ID: 3
Found -> Name: Nikil R, Age: 20
```

---

### 4️⃣ Delete Student
Removes a student record from the file using their **ID**.

Example:
```
Enter student ID to delete: 4
Student deleted successfully.
```

---

## 🧠 Concepts Practiced

- Java File Handling
- Buffered Streams
- Exception Handling
- Input Validation
- CRUD Operations using Files
- Menu-driven Java programs

---

⭐ Part of my **Java Concept Revision & Advanced Learning** journey.
