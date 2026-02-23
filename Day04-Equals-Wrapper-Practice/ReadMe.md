# 🚀 Day 04 – Equals, Wrapper & Practice (Java Concept Revision & Advanced)

## 📌 Topics Covered
- `equals()` method
- Wrapper Classes
- Autoboxing & Unboxing
- Practice Examples

---

## 🧠 What I Practiced

### ✅ `equals()` Method
- Difference between `==` and `equals()`
- When to override `equals()`
- Importance in object comparison

### ✅ Wrapper Classes
- `Integer`, `Double`, `Character`, etc.
- Why wrappers are useful

### ✅ Autoboxing & Unboxing
- Automatic conversion between primitives and wrappers
- When it happens

### ✅ Practice Examples
- String comparison
- Wrapper usage
- Edge cases

---

## 💡 Key Learnings
- `==` checks reference equality for objects, while `equals()` checks logical equality.
- Wrapper classes let you use primitives as objects.
- Autoboxing simplifies code but can introduce pitfalls like `NullPointerException`.

---

## 🛠 Sample Code Example

```java
public class Day04Example {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);        // true (cached)
        System.out.println(a.equals(b));   // true

        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y);        // false
        System.out.println(x.equals(y));   // true

        int num = x;  // unboxing
        Integer boxed = num; // autoboxing
        System.out.println(boxed);
    }
}
```

---

## ⏱ Time Spent
1–2 hours practicing object comparison and wrapper features.

---

## 🎯 Goal
Strengthen understanding of object equality and how Java handles primitive vs object types.
