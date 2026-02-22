# 🚀 Day 09 – Recursion & Introduction to Dynamic Programming

## 📚 Topics Covered

Today I focused on strengthening recursion fundamentals and learning the basics of Dynamic Programming (DP).

---

## 🧠 Recursion

Concepts practiced:
- Base Case and Recursive Case
- Understanding Call Stack
- Tree Recursion (Fibonacci)
- Difference between Recursion and Iteration

Problems solved:
- Print 1 to N
- Print N to 1
- Sum of First N Numbers
- Fibonacci (Recursive)

---

## 🔥 Dynamic Programming (DP)

Learned:
- Overlapping Subproblems
- Optimal Substructure
- Memoization (Top-Down)
- Tabulation (Bottom-Up)
- Space Optimization

---

## ✅ LeetCode Problems Solved

1. Climbing Stairs  
   Pattern: Fibonacci-based recurrence  
   Time Complexity: O(n)  
   Space Complexity: O(1)

2. House Robber  
   Pattern: Take or Skip (Maximization DP)  
   Transition:
   dp[i] = max(nums[i] + dp[i-2], dp[i-1])  
   Time Complexity: O(n)  
   Space Complexity: O(1)

3. Coin Change  
   Pattern: Minimization DP  
   Transition:
   dp[i] = min(dp[i], 1 + dp[i - coin])  
   Time Complexity: O(amount × number_of_coins)  
   Space Complexity: O(amount)

---

## 📈 Key Takeaways

- Recursion is the foundation of DP.
- DP avoids recomputation by storing results.
- Always identify:
  - State
  - Transition
  - Base Case

---

Consistency > Intensity  
Day 09 Completed ✅
