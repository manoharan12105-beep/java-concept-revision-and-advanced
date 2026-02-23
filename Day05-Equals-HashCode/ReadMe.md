# 🚀 Day 05 – `equals()` & `hashCode()` (Java Concept Revision & Advanced)

## 📌 Topics Covered
- `equals()` method
- `hashCode()` method
- Relationship between `equals()` & `hashCode()`
- Why overriding both matters
- Practice examples

---

## 🧠 What I Practiced

### ✅ `equals()` Method
- Used for logical equality
- Default behavior from `Object`
- Overridden to compare object fields

### ✅ `hashCode()` Method
- Returns an `int` hash code value for the object
- Used in hashing data structures like `HashMap`, `HashSet`

### ✅ Relationship Between `equals()` & `hashCode()`
- If `equals()` returns `true`, `hashCode()` *must* be equal
- If `equals()` returns `false`, `hashCode()` *can* be equal or not
- Proper overriding prevents bugs in hash collections

### ✅ Practice Examples
- Custom classes with fields
- Correct and incorrect implementations
- Seeing the difference in collections

---

## 💡 Key Learnings
- Objects that are equal must have the same hash code.
- Not overriding `hashCode()` when overriding `equals()` causes inconsistent behavior in hash-based collections.
- `HashSet` and `HashMap` heavily depend on `hashCode()`.

---

## 🛠 Sample Code Example

```java
import java.util.HashSet;
import java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Day05EqualsHashCode {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("Mano", 20));
        set.add(new Person("Mano", 20));

        System.out.println(set.size()); // 1
    }
}
```

---

## ⏱ Time Spent
1–2 hours strengthening core OOP behavior for equality and hashing.

---

## 🎯 Goal
Understand how and why `equals()` and `hashCode()` must be overridden together for consistent behavior in Java collections.
