# 🚀 Day 16 — Lambda Expressions & Streams (Java)

Today I learned and practiced Lambda Expressions and the Streams API in Java.

These features were introduced in Java 8 and allow writing cleaner, more readable, and functional-style code.

---

## 📌 Topics Covered

### 🔹 Lambda Expressions
- Implementing functional interfaces
- Replacing anonymous classes
- Passing behavior as arguments
- Writing cleaner and shorter code

Example:
```java
Printable p = msg -> System.out.println("Message: " + msg);
p.print("Hello World");
```

---

### 🔹 Streams API
- filter() — select elements
- map() — transform elements
- collect() — convert stream to list
- forEach() — terminal operation
- reduce() — combine elements

Example:
```java
List<Integer> result = list.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .collect(Collectors.toList());
```

---

## 🎯 Key Learnings

- Functional Interface = Interface with only one abstract method
- Lambda is a short way to implement a functional interface
- Streams help process collections in a declarative way
- Stream operations are lazy and require a terminal operation

---


## 📚 Why This Matters

Lambda expressions and Streams are heavily used in:
- Backend development
- Spring Boot applications
- Data processing
- Clean and modern Java coding

---

✅ Day 16 Complete — Moving closer to mastering modern Java.
