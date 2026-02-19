```
```

Problems:
- No type safety
- Explicit casting required
- Runtime `ClassCastException` possible

With Generics:

```java
List<String> list = new ArrayList<>();
list.add("Hello");
String str = list.get(0);  // Safe
```

✔ Type safety  
✔ No casting  
✔ Compile-time error detection  

---

# 2️⃣ Generic Class

A generic class allows type parameterization.

```java
class GenericExample<T> {

    T value;

    public GenericExample(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}
```

Usage:

```java
GenericExample<Integer> intObj = new GenericExample<>(10);
GenericExample<String> strObj = new GenericExample<>("Java");
```

Here:
- `<T>` is a type parameter
- Type is decided at object creation time

---

# 3️⃣ Generic Methods

Generic methods define their own type parameters.

```java
public static <T> void display(T value) {
    System.out.println(value);
}
```

Key Rule:
`<T>` must appear before return type.

Generic methods are independent of class-level generics.

---

# 4️⃣ Bounded Type Parameters

Sometimes we want to restrict types.

```java
class NumberBox<T extends Number> {
    T number;

    public double getDoubleValue() {
        return number.doubleValue();
    }
}
```

Meaning:
- `T` must be `Number` or its subclass
- Prevents invalid types like `String`

Valid:
```
NumberBox<Integer>
NumberBox<Double>
```

Invalid:
```
NumberBox<String> ❌
```

---

# 5️⃣ Wildcards

Wildcards provide flexibility when working with collections.

## 🔹 Unbounded Wildcard

```java
List<?> list;
```

- Can hold any type
- Can read as `Object`
- Cannot add elements (except `null`)

---

## 🔹 Upper Bounded Wildcard (`extends`)

```java
List<? extends Number>
```

Meaning:
- Some unknown subtype of `Number`

✔ Safe to read as `Number`  
❌ Cannot add elements  

---

## 🔹 Lower Bounded Wildcard (`super`)

```java
List<? super Integer>
```

Meaning:
- `Integer` or any parent of `Integer`

✔ Safe to add `Integer`  
⚠ When reading, only `Object` is guaranteed  

---

# 6️⃣ PECS Principle

PECS = Producer Extends, Consumer Super

- If it PRODUCES data → use `extends`
- If it CONSUMES data → use `super`

Example:

```java
public static double sum(List<? extends Number> list)
```

```java
public static void addIntegers(List<? super Integer> list)
```

---

# 7️⃣ Type Erasure

Generics exist only at compile time.

At runtime:
- Type parameters are removed
- Replaced with `Object` (or bound type)

This explains:
- Why `new T()` is not allowed
- Why primitives cannot be used
- Why some generic overloads fail

---

# 🔟 Key Takeaways

- Generics ensure compile-time type safety
- Wildcards provide flexibility
- `extends` = read safely
- `super` = write safely
- PECS helps choose correct wildcard
- Generics are compile-time only

---

Day 5 Complete – Java Generics Mastery
