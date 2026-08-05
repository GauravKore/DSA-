# 🚀 LeetCode 1920 - Build Array from Permutation

![Java](https://img.shields.io/badge/Language-Java-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

🔗 **Problem Link:** https://leetcode.com/problems/build-array-from-permutation/

---

## 📖 Problem Statement

Given a **zero-based permutation** `nums` (0-indexed), build an array `ans` of the same length such that:

```text
ans[i] = nums[nums[i]]
```

Return the constructed array.

A **zero-based permutation** means every integer from `0` to `n - 1` appears exactly once in `nums`.

---

## 💡 Example

### Input

```text
nums = [0,2,1,5,3,4]
```

### Output

```text
[0,1,2,4,5,3]
```

### Explanation

| i | nums[i] | nums[nums[i]] | ans[i] |
|---|---------|---------------|--------|
|0|0|nums[0]=0|0|
|1|2|nums[2]=1|1|
|2|1|nums[1]=2|2|
|3|5|nums[5]=4|4|
|4|3|nums[3]=5|5|
|5|4|nums[4]=3|3|

Final Answer:

```text
[0,1,2,4,5,3]
```

---

## 💡 Intuition

Think of every element as an **index pointer**.

- Start at index `i`.
- Go to `nums[i]`.
- Treat that value as another index.
- Pick the value stored there.
- Store it in the answer array.

Simply repeat this for every index.

---

## 🚀 Approach 1 - Brute Force

### Idea

Create a new array `ans` and directly compute:

```text
ans[i] = nums[nums[i]]
```

Since every element is processed exactly once, this is already an efficient solution.

### Algorithm

1. Create an array `ans` of size `n`.
2. Traverse the array.
3. For every index `i`, assign:
   ```text
   ans[i] = nums[nums[i]]
   ```
4. Return `ans`.

### Complexity

| Time | Space |
|------|-------|
| O(n) | O(n) |

---

## ⭐ Approach 2 - Optimal (In-Place Encoding)

### Idea

Since every value lies in the range `0` to `n - 1`, we can temporarily store **both the old and new values** inside the same element using mathematical encoding.

Encoding:

```text
nums[i] = nums[i] + n * (nums[nums[i]] % n)
```

Decoding:

```text
nums[i] = nums[i] / n
```

This avoids using an extra array.

> **Note:** The brute-force solution is the one generally expected in interviews for this easy problem. The in-place approach is an advanced optimization.

### Complexity

| Time | Space |
|------|-------|
| O(n) | O(1) |

---

## 🔍 Dry Run

Input

```text
nums = [0,2,1,5,3,4]
```

| i | nums[i] | nums[nums[i]] | ans |
|---|---------|---------------|-----|
|0|0|0|[0,_,_,_,_,_]|
|1|2|1|[0,1,_,_,_,_]|
|2|1|2|[0,1,2,_,_,_]|
|3|5|4|[0,1,2,4,_,_]|
|4|3|5|[0,1,2,4,5,_]|
|5|4|3|[0,1,2,4,5,3]|

Final Answer

```text
[0,1,2,4,5,3]
```

---

## ⚠️ Edge Cases

- Array of size 1
- Smallest valid permutation
- Largest valid permutation
- Reverse permutation
- Random permutation

---

## ❌ Common Mistakes

- Writing `ans[i] = nums[i]` instead of `nums[nums[i]]`.
- Forgetting that `nums[i]` is used as an **index**, not a value.
- Modifying the original array before computing all values (unless using the in-place encoding method).
- Confusing index and element values.

---

## 📚 Concepts Used

- ✅ Arrays
- ✅ Array Traversal
- ✅ Index Mapping
- ✅ Permutation
- ✅ In-place Optimization (Advanced)

---

## 📈 Complexity Analysis

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n) | O(n) |
| Optimal (Encoding) | O(n) | O(1) |

---

## 💻 Java Solution

class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for( int i = 0 ; i < nums.length; i++){
            result[i]= nums[nums[i]];
        }
        return result;
    }
}
```

---

## 🧠 Interview Tips

- The key observation is that every element is a **valid index**.
- Whenever you see `nums[nums[i]]`, think of it as **double indexing**.
- Mention the in-place encoding optimization if the interviewer asks for reducing extra space.
- Always clarify whether modifying the original array is allowed before using the in-place approach.

---

## 📂 Folder Structure

```text
Arrays/
└── Basics/
    └── BuildArrayFromPermutation/
        ├── Solution.java
        └── README.md
```

---

## 🔗 Related Problems

- [1929. Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
- [1480. Running Sum of 1D Array](https://leetcode.com/problems/running-sum-of-1d-array/)
- [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- [27. Remove Element](https://leetcode.com/problems/remove-element/)
- [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

---

## 🏷️ Tags

`Array` `Traversal` `Permutation` `Index Mapping` `Simulation` `Easy` `Java` `LeetCode`

---

## 👨‍💻 Author

**Gaurav Kore**

🔗 GitHub: https://github.com/GauravKore

⭐ If you found this solution helpful, consider giving the repository a **star**!
