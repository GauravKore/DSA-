# 🚀 LeetCode 977 - Squares of a Sorted Array

![Java](https://img.shields.io/badge/Language-Java-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

🔗 **Problem Link:** https://leetcode.com/problems/squares-of-a-sorted-array/

---

## 📖 Problem Statement

Given an integer array `nums` sorted in **non-decreasing order**, return an array of the **squares of each number**, also sorted in **non-decreasing order**.

### Example

**Input**
```text
nums = [-4,-1,0,3,10]
```

**Output**
```text
[0,1,9,16,100]
```

**Explanation**

After squaring each element:

```text
[16,1,0,9,100]
```

Sorting them gives:

```text
[0,1,9,16,100]
```

---

## 💡 Intuition

- Squaring negative numbers makes them positive.
- The largest square always comes from either the leftmost negative number or the rightmost positive number.
- First, square every element.
- Then, use two pointers to compare both ends and place the larger square at the end of the result array.

---

## 🚀 Approach 1 - Brute Force

### Idea

Square every element and then sort the array.

### Algorithm

1. Square every element.
2. Sort the array.
3. Return the sorted array.

### Complexity

| Time | Space |
|------|-------|
| O(n log n) | O(1) |

---

## ⭐ Approach 2 - Optimal (Two Pointers)

### Idea

1. Square every element.
2. Since the largest squared value will always be at one of the ends, compare both ends using two pointers.
3. Place the larger square at the last available position in the result array.

### Data Structure

- Array
- Two Pointers

### Algorithm

1. Create a result array.
2. Square every element in `nums`.
3. Initialize:
   - `i = 0`
   - `j = nums.length - 1`
4. Traverse from the last index of the result array.
5. Compare `nums[i]` and `nums[j]`.
6. Place the larger value into the current position.
7. Move the corresponding pointer.
8. Return the result array.

### Complexity

| Time | Space |
|------|-------|
| O(n) | O(n) |

---

## 🔍 Dry Run

Input

```text
nums = [-4,-1,0,3,10]
```

After squaring

```text
nums = [16,1,0,9,100]
```

| Step | i | j | Position | Chosen Value | Result |
|------|---|---|----------|--------------|----------------|
| Start | 0 | 4 | 4 | 100 | [_,_,_,_,100] |
| 2 | 0 | 3 | 3 | 16 | [_,_,_,16,100] |
| 3 | 1 | 3 | 2 | 9 | [_,_,9,16,100] |
| 4 | 1 | 2 | 1 | 1 | [_,1,9,16,100] |
| 5 | 2 | 2 | 0 | 0 | [0,1,9,16,100] |

Final Output

```text
[0,1,9,16,100]
```

---

## ⚠️ Edge Cases

- Single element array
- All positive numbers
- All negative numbers
- Array containing only zero
- Duplicate values

---

## ❌ Common Mistakes

- Forgetting to square the elements before comparing.
- Filling the result array from the beginning instead of the end.
- Moving the wrong pointer after placing an element.
- Sorting after using two pointers (unnecessary).

---

## 📚 Concepts Used

- ✅ Arrays
- ✅ Two Pointers
- ✅ Simulation

---

## 📈 Complexity Analysis

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n log n) | O(1) |
| Optimal | O(n) | O(n) |

---

## 💻 Java Solution

```java
class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        // Square all elements
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int i = 0;
        int j = nums.length - 1;

        // Place larger squares at the end
        for (int pos = nums.length - 1; pos >= 0; pos--) {

            if (nums[i] < nums[j]) {
                result[pos] = nums[j];
                j--;
            } else {
                result[pos] = nums[i];
                i++;
            }
        }

        return result;
    }
}
```

---

## 📂 Folder Structure

```text
Arrays/
└── TwoPointers/
    └── SquaresOfSortedArray/
        ├── Solution.java
        └── README.md
```

---

## 🔗 Related Problems

- Merge Sorted Array
- Move Zeroes
- Sort Array By Parity
- Remove Duplicates from Sorted Array
- Remove Element

---

## 🏷️ Tags

`Array` `Two Pointers` `Simulation` `Sorting` `Java` `LeetCode`

---

## 👨‍💻 Author

**Gaurav Kore**

🔗 GitHub: https://github.com/GauravKore

⭐ If you found this solution helpful, consider starring the repository!
