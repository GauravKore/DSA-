# 🚀 LeetCode 27 - Remove Element

![Java](https://img.shields.io/badge/Language-Java-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

🔗 **Problem Link:** https://leetcode.com/problems/remove-element/

---

## 📖 Problem Statement

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` **in-place** and return the number of remaining elements. The relative order of the remaining elements may change.

---

## 💡 Example

### Input

```text
nums = [3,2,2,3]
val = 3
```

### Output

```text
2
```

### Explanation

After removing all occurrences of `3`, the array becomes:

```text
[2,2]
```

The function returns `2`.

---

## 💡 Intuition

- Traverse the array once.
- Keep only the elements that are **not equal** to `val`.
- Store them from the beginning of the array using a pointer.
- Return the count of valid elements.

---

## 🚀 Approach 1 - Brute Force

### Idea

Create a new array and copy only the elements that are not equal to `val`.

### Algorithm

1. Create a new array.
2. Traverse the original array.
3. Copy valid elements.
4. Return the count.

### Complexity

| Time | Space |
|------|-------|
| O(n) | O(n) |

---

## ⭐ Approach 2 - Optimal (Two Pointers)

### Idea

Use one pointer (`i`) to traverse the array and another pointer (`k`) to place valid elements at the beginning of the array.

### Data Structure

- Array
- Two Pointers

### Algorithm

1. Initialize `k = 0`.
2. Traverse the array.
3. If `nums[i] != val`, assign `nums[k] = nums[i]`.
4. Increment `k`.
5. Return `k`.

### Complexity

| Time | Space |
|------|-------|
| O(n) | O(1) |

---

## 🔍 Dry Run

Input

```text
nums = [3,2,2,3]
val = 3
```

| i | nums[i] | Action | k |
|---|---------|--------|---|
|0|3|Skip|0|
|1|2|Store at nums[0]|1|
|2|2|Store at nums[1]|2|
|3|3|Skip|2|

Final Array

```text
[2,2,_,_]
```

Return

```text
2
```

---

## ⚠️ Edge Cases

- Empty array
- All elements equal to `val`
- No element equal to `val`
- Single-element array
- Duplicate values

---

## ❌ Common Mistakes

- Returning the modified array instead of its length.
- Forgetting to increment the write pointer.
- Comparing the wrong value.
- Using extra space when an in-place solution is required.

---

## 📚 Concepts Used

- ✅ Arrays
- ✅ Two Pointers
- ✅ In-place Modification

---

## 📈 Complexity Analysis

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n) | O(n) |
| Optimal | O(n) | O(1) |

---

## 💻 Java Solution

```java
class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
```

---

## 📂 Folder Structure

```text
Arrays/
└── TwoPointers/
    └── RemoveElement/
        ├── Solution.java
        └── README.md
```

---

## 🔗 Related Problems

- [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- [80. Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
- [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
- [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/)
- [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)

---

## 🏷️ Tags

`Array` `Two Pointers` `In-place` `Easy` `Java` `LeetCode`

---

## 👨‍💻 Author

**Gaurav Kore**

🔗 GitHub: https://github.com/GauravKore

⭐ If you found this solution helpful, consider giving the repository a **star**!
