# 📚 Day 07 — Java Collections Basics

## 🚀 Topics Covered
Today I learned the fundamentals of the Java Collections Framework, focusing on:

- ArrayList
- HashSet
- HashMap
- Basic iteration techniques

The goal was to understand how Java stores and manages groups of objects efficiently.

---

# 🧱 1️⃣ ArrayList

### 📌 What is ArrayList?
ArrayList is a dynamic array implementation of the `List` interface.
- Allows duplicate elements
- Maintains insertion order
- Automatically resizes when capacity is exceeded

### 🔹 Most Used Methods
- `add(E e)` → Add element
- `get(int index)` → Access element
- `remove(int index)` → Remove element by index
- `size()` → Get number of elements
- `contains(Object o)` → Check if element exists
- `clear()` → Remove all elements

### ✅ When to Use
- When you need ordered data
- When frequent access by index is required

---

# 🔹 2️⃣ HashSet

### 📌 What is HashSet?
HashSet is a collection that:
- Does NOT allow duplicate elements
- Does NOT maintain insertion order
- Uses hashing internally

### 🔹 Most Used Methods
- `add(E e)` → Add element
- `remove(Object o)` → Remove element
- `contains(Object o)` → Check existence
- `size()` → Number of elements
- `isEmpty()` → Check if empty
- `clear()` → Remove all elements

### ✅ When to Use
- When uniqueness is important
- When order does not matter

---

# 🔹 3️⃣ HashMap

### 📌 What is HashMap?
HashMap stores data in key–value pairs.
- Keys must be unique
- Values can be duplicated
- Does not maintain insertion order

### 🔹 Most Used Methods
- `put(K key, V value)` → Insert or update value
- `get(Object key)` → Retrieve value
- `remove(Object key)` → Remove entry
- `containsKey(Object key)` → Check key existence
- `containsValue(Object value)` → Check value existence
- `size()` → Number of entries
- `entrySet()` → Iterate key-value pairs

### ✅ When to Use
- When you need fast lookup by key
- When storing related key-value data

---

# 🔁 Iteration Techniques Learned

- Enhanced for loop
- Using `entrySet()` for HashMap
- Basic traversal of collections

---

# 🎯 Key Differences

| Feature      | ArrayList | HashSet | HashMap |
|-------------|------------|----------|----------|
| Duplicates  | Allowed    | Not Allowed | Keys Not Allowed |
| Order       | Maintained | Not Maintained | Not Maintained |
| Index Access| Yes        | No       | No |
| Key-Value   | No         | No       | Yes |

---

# 🎯 Learning Outcome

After Day 07, I can:

- Understand differences between List, Set, and Map
- Use commonly used collection methods confidently
- Store and retrieve grouped data efficiently
- Choose the appropriate collection based on use case

---

📌 This forms the foundation for solving DSA problems and backend development tasks.
