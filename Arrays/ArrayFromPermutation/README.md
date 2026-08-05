# 🚀 LeetCode 1920 - Build Array from Permutation

![Java](https://img.shields.io/badge/Language-Java-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

🔗 **Problem Link:** https://leetcode.com/problems/build-array-from-permutation/

---

# 📖 Problem Statement

Given a **zero-based permutation** `nums` (0-indexed), build an array `result` of the same length such that:

```text
result[i] = nums[nums[i]]
```

Return the newly created array.

A **zero-based permutation** means every integer from `0` to `n - 1` appears exactly once in the array.

---

# 💡 Example

### Input

```text
nums = [0,2,1,5,3,4]
```

### Output

```text
[0,1,2,4,5,3]
```

### Explanation

| Index (i) | nums[i] | nums[nums[i]] | result[i] |
|-----------|---------|---------------|-----------|
| 0 | 0 | nums[0] = 0 | 0 |
| 1 | 2 | nums[2] = 1 | 1 |
| 2 | 1 | nums[1] = 2 | 2 |
| 3 | 5 | nums[5] = 4 | 4 |
| 4 | 3 | nums[3] = 5 | 5 |
| 5 | 4 | nums[4] = 3 | 3 |

Final Result

```text
[0,1,2,4,5,3]
```

---

# 💡 Intuition

Each element of the array represents another valid index.

For every index:

1. Read `nums[i]`.
2. Treat that value as a new index.
3. Pick the value stored at that index.
4. Store it in the result array.

This is simply **array traversal with index mapping**.

---

# 🚀 Approach

### Idea

Create a new array `result` and traverse the original array once.

For every index:

```text
result[i] = nums[nums[i]]
```

Return the newly created array.

---

# 📝 Algorithm

1. Create a new array `result`.
2. Traverse the array from `0` to `n-1`.
3. Store `nums[nums[i]]` into `result[i]`.
4. Return `result`.

---

# 🔍 Dry Run

Input

```text
nums = [0,2,1,5,3,4]
```

| i | nums[i] | nums[nums[i]] | result |
|---|---------|---------------|--------|
|0|0|0|[0,_,_,_,_,_]|
|1|2|1|[0,1,_,_,_,_]|
|2|1|2|[0,1,2,_,_,_]|
|3|5|4|[0,1,2,4,_,_]|
|4|3|5|[0,1,2,4,5,_]|
|5|4|3|[0,1,2,4,5,3]|

Final Output

```text
[0,1,2,4,5,3]
```

---

# ⚠️ Edge Cases

- Array contains only one element.
- Smallest valid permutation.
- Largest valid permutation.
- Reverse permutation.
- Random permutation.

---

# ❌ Common Mistakes

- Writing `result[i] = nums[i]`.
- Confusing element values with array indices.
- Modifying the original array accidentally.
- Forgetting that every value is itself a valid index.

---

# 📚 Concepts Used

- ✅ Arrays
- ✅ Array Traversal
- ✅ Index Mapping
- ✅ Simulation

---

# 📈 Complexity Analysis

| Complexity | Value |
|------------|-------|
| Time | **O(n)** |
| Space | **O(n)** |

---

# 💻 Java Solution

```java
class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
```

---

# 🧠 Interview Tips

- This is **not** a Two Pointer problem.
- This is **not** a Sliding Window problem.
- It is simply **Array Traversal + Index Mapping**.
- Whenever you see `nums[nums[i]]`, read it as:
  > "Use the current value as an index and fetch the value stored there."

---

# 🎯 Pattern Recognition

✅ Pattern: **Array Traversal**

Recognition Clues:

- Traverse every element exactly once.
- No sorting required.
- No extra data structure like HashMap or Stack.
- Every value is a valid array index.

---

# 📂 Folder Structure

```text
Arrays/
└── ArrayFromPermutation/
    ├── ArrayFromPermutation.java
    └── README.md
```

---

# 🔗 Related Problems

- [1929. Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
- [1480. Running Sum of 1D Array](https://leetcode.com/problems/running-sum-of-1d-array/)
- [27. Remove Element](https://leetcode.com/problems/remove-element/)
- [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

---

# 🏷️ Tags

`Array` `Traversal` `Index Mapping` `Simulation` `Easy` `Java` `LeetCode`

---

# 👨‍💻 Author

**Gaurav Kore**

🔗 GitHub: https://github.com/GauravKore

⭐ If you found this solution helpful, consider giving the repository a **star**!
