# 🚀 Day 13 – LinkedList Implementation (Java DSA Journey)

## 📌 Overview

On Day 13, I implemented a **Singly Linked List from scratch in Java** to understand how linked data structures work internally.

This implementation does NOT use Java’s built-in `LinkedList` class.  
All operations are built manually using Node references.

---

## 🧱 Features Implemented

- Insert at beginning
- Insert at end
- Insert at specific position
- Delete by value
- Delete by position
- Search element
- Reverse linked list (iterative)
- Size tracking
- Display list

---

## 🧠 Core Concepts Practiced

- Designing a Node class
- Pointer manipulation
- Traversing using temporary references
- Managing head pointer correctly
- Handling edge cases:
  - Empty list
  - Deleting head node
  - Invalid positions
- Iterative reversal logic

---

## ⏱ Time Complexity

| Operation | Complexity |
|-----------|------------|
| Insert at beginning | O(1) |
| Insert at end | O(n) |
| Insert at position | O(n) |
| Delete by value | O(n) |
| Delete by position | O(n) |
| Search | O(n) |
| Reverse | O(n) |

---

## 🔁 Reverse Logic Used

Used the standard 3-pointer approach:

- `prev`
- `current`
- `next`

Steps:
1. Store next node
2. Reverse current.next to prev
3. Move prev forward
4. Move current forward
5. Finally assign `head = prev`

---

## 📂 File Structure

```
Day13-LinkedList/
│── MyLinkedList.java
│── README.md
```

---

## ▶️ Sample Output

```
List:
5 -> 10 -> 15 -> 20 -> null
After deleting 10:
5 -> 15 -> 20 -> null
After reversing:
20 -> 15 -> 5 -> null
Size: 3
Search 20: true
```

---

## 🎯 What I Learned

- LinkedList uses non-contiguous memory
- Access by index is O(n)
- Insert/delete at head is efficient
- Pointer manipulation requires careful link updates
- Reversal logic strengthens DSA fundamentals
