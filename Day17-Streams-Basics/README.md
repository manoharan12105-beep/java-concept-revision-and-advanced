# Day 17 — Java Streams Practice

Today’s focus was strengthening my understanding of the Java Streams API by solving practical array-based problems and implementing real LeetCode challenges using streams.

The goal was to understand stream pipelines clearly and evaluate when streams are appropriate versus when traditional loops are better.

---

## Topics Covered

• Stream creation using Arrays.stream()  
• filter()  
• distinct()  
• sorted()  
• max()  
• skip()  
• findFirst()  
• IntStream.rangeClosed()  
• Comparator.reverseOrder()  
• Method references  
• Optional handling  
• Primitive vs Boxed streams  

---

## Problems Implemented

### 1. Print Even Numbers
Filtered even numbers from an int array using IntStream.

Concepts:
- filter()
- forEach()
- Method reference vs lambda

---

### 2. Find Maximum Element
Used max() on IntStream.

Concepts:
- Terminal operations
- Optional handling

Time Complexity: O(n)

---

### 3. Find Second Maximum (Distinct Values)
Used:
distinct() → boxed() → sorted(reverseOrder) → skip(1) → findFirst()

Concepts:
- Removing duplicates
- Sorting in descending order
- Skipping elements
- Understanding O(n log n) due to sorting

Time Complexity: O(n log n)

---

### 4. LeetCode 2180 — Count Integers With Even Digit Sum
Used IntStream.rangeClosed() and filter() with arithmetic digit sum logic.

Concepts:
- Range streams
- Aggregation using count()
- Functional-style filtering

Time Complexity: O(n log n) (digit processing per number)

---

### 5. LeetCode 414 — Third Maximum Number
Stream-based solution:

distinct() → boxed() → sorted(reverseOrder) → skip(2) → findFirst()

Handled edge case:
If fewer than 3 distinct elements exist, return maximum.

Concepts:
- Distinct value extraction
- Comparator usage
- Optional fallback logic
- Tradeoff between O(n log n) stream solution and O(n) optimal loop solution

Time Complexity: O(n log n)

---

## Key Learnings

• Streams are single-use and cannot be reused after a terminal operation  
• Primitive streams (IntStream) avoid boxing overhead  
• Sorting significantly increases time complexity  
• Streams improve readability and express intent clearly  
• Not every algorithm should be forced into streams  
• Performance vs readability trade-offs must be evaluated consciously  

---

## Engineering Insight

Streams are excellent for:
- Data transformation
- Filtering pipelines
- Aggregation
- Grouping operations

Traditional loops are better for:
- Strict O(n) optimization
- In-place modification
- Heavy algorithmic logic

Understanding both approaches is essential for backend engineering.

---

Consistent daily practice is improving both algorithmic thinking and modern Java proficiency.
