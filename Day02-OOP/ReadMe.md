# 🚀 Day 02 – Object Oriented Programming (Java Concept Revision & Advanced)

## 📌 Topics Covered
- Classes & Objects
- Encapsulation
- Constructors
- Methods
- `this` keyword

---

## 🧠 What I Practiced

### ✅ Classes & Objects
- How to define a class
- How to create objects

### ✅ Encapsulation
- `private` fields
- Public getters and setters

### ✅ Constructors
- Default constructor
- Parameterized constructor

### ✅ Methods
- Instance methods
- Passing parameters
- Returning values

### ✅ `this` Keyword
- Differentiating between instance variables and parameters

---

## 💡 Key Learnings
- Objects are instances of classes.
- Encapsulation helps protect internal state.
- Constructors initialize objects.
- Methods define behavior.
- `this` references the current object.

---

## 🛠 Sample Code Example

```java
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Day02OOP {
    public static void main(String[] args) {
        Person p1 = new Person("Mano", 20);
        p1.showDetails();
    }
}
```

---

## ⏱ Time Spent
2–3 hours focusing on understanding core OOP principles and writing examples.

---

## 🎯 Goal
Build a solid foundation in Object Oriented Programming to support future advanced topics like inheritance, polymorphism, and abstraction.
