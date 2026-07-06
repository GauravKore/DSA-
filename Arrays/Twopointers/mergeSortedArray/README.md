# 🚀 LeetCode 88 - Merge Sorted Array

![Java](https://img.shields.io/badge/Language-Java-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

🔗 **Problem Link:** https://leetcode.com/problems/merge-sorted-array/

---

## 📖 Problem Statement

You are given two sorted integer arrays `nums1` and `nums2`, and two integers `m` and `n`, representing the number of valid elements in each array.

Merge `nums2` into `nums1` as one sorted array.

The final sorted array should be stored inside `nums1`, which has enough extra space to hold all elements of `nums2`.

### Example

**Input**
```text
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
```

**Output**
```text
[1,2,2,3,5,6]
```

**Explanation**

Merge both sorted arrays into `nums1` while maintaining the sorted order.

---

## 💡 Intuition

- Since both arrays are already sorted, compare elements from the end instead of the beginning.
- The largest element should always be placed at the last available position in `nums1`.
- This avoids shifting elements and allows the merge to happen in-place.

---

## 🚀 Approach 1 - Brute Force

### Idea

Copy all elements of `nums2` into the empty positions of `nums1` and then sort the entire array.

### Algorithm

1. Copy `nums2` into `nums1`.
2. Sort `nums1`.
3. Return the merged array.

### Complexity

| Time | Space |
|------|-------|
| O((m+n) log(m+n)) | O(1) |

---

## ⭐ Approach 2 - Optimal (Three Pointers)

### Idea

Use three pointers:

- `i` → Last valid element in `nums1`
- `j` → Last element in `nums2`
- `k` → Last index of `nums1`

Compare `nums1[i]` and `nums2[j]`.

- If `nums1[i]` is larger, place it at `nums1[k]`.
- Otherwise, place `nums2[j]` at `nums1[k]`.

Repeat until every element of `nums2` has been merged.

### Data Structure

- Array
- Three Pointers

### Algorithm

1. Initialize:
   - `i = m - 1`
   - `j = n - 1`
   - `k = m + n - 1`
2. While `j >= 0`:
   - If `i >= 0` and `nums1[i] > nums2[j]`, copy `nums1[i]`.
   - Otherwise, copy `nums2[j]`.
   - Decrement `k`.
3. Return the modified `nums1`.

### Complexity

| Time | Space |
|------|-------|
| O(m+n) | O(1) |

---

## 🔍 Dry Run

Input

```text
nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
```

| Step | i | j | k | Action | nums1 |
|------|---|---|---|--------|----------------|
| Start | 2 | 2 | 5 | Initial | [1,2,3,0,0,0] |
| 1 | 2 | 2 | 5 | Place 6 | [1,2,3,0,0,6] |
| 2 | 2 | 1 | 4 | Place 5 | [1,2,3,0,5,6] |
| 3 | 2 | 0 | 3 | Place 3 | [1,2,3,3,5,6] |
| 4 | 1 | 0 | 2 | Place 2 | [1,2,2,3,5,6] |
| End | 1 | -1 | 1 | Stop | [1,2,2,3,5,6] |

**Final Output**

```text
[1,2,2,3,5,6]
```

---

## ⚠️ Edge Cases

- `nums2` is empty (`n = 0`)
- `nums1` has no valid elements (`m = 0`)
- All elements in `nums2` are smaller
- All elements in `nums2` are larger
- Arrays contain duplicate values

---

## ❌ Common Mistakes

- Starting the merge from the beginning instead of the end.
- Forgetting to check `i >= 0` before accessing `nums1[i]`.
- Incorrect pointer initialization.
- Decrementing the wrong pointer.

---

## 📚 Concepts Used

- ✅ Arrays
- ✅ Three Pointers
- ✅ Two Pointers
- ✅ In-place Algorithm

---

## 📈 Complexity Analysis

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O((m+n) log(m+n)) | O(1) |
| Optimal | O(m+n) | O(1) |

---

## 💻 Java Solution

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
```

---

## 📂 Folder Structure

```text
Arrays/
└── TwoPointers/
    └── MergeSortedArray/
        ├── Solution.java
        └── README.md
```

---

## 🔗 Related Problems

- Remove Duplicates from Sorted Array
- Remove Element
- Move Zeroes
- Squares of a Sorted Array
- Sort Array By Parity

---

## 🏷️ Tags

`Array` `Two Pointers` `Three Pointers` `Sorting` `In-place` `Java` `LeetCode`

---

## 👨‍💻 Author

**Gaurav Kore**

🔗 GitHub: https://github.com/GauravKore

⭐ If you found this solution helpful, consider starring the repository!
