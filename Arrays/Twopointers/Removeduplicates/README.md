# 🚀 LeetCode 26 - Remove Duplicates from Sorted Array

![Java](https://img.shields.io/badge/Language-Java-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

🔗 **Problem Link:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/

---

## 📖 Problem Statement

Given a **sorted integer array** `nums`, remove the duplicates **in-place** such that each unique element appears only once.

Return the number of unique elements (`k`).

The relative order of the elements should remain the same.

### Example

**Input**
```text
nums = [1,1,2]
```

**Output**
```text
k = 2
nums = [1,2,_]
```

**Explanation**

The first `k` elements contain the unique values `[1,2]`. The remaining elements are not important.

---

## 💡 Intuition

- Since the array is already sorted, duplicate elements are adjacent.
- Keep one pointer pointing to the last unique element.
- Traverse the array using another pointer.
- Whenever a new unique element is found, place it after the last unique element.

---

## 🚀 Approach 1 - Brute Force

### Idea

Store all unique elements in another array or list and then copy them back into the original array.

### Algorithm

1. Create a temporary array/list.
2. Traverse the array.
3. Store only unique elements.
4. Copy them back into `nums`.
5. Return the number of unique elements.

### Complexity

| Time | Space |
|------|-------|
| O(n) | O(n) |

---

## ⭐ Approach 2 - Optimal (Two Pointers)

### Idea

Use two pointers:

- `k` keeps track of the last unique element.
- `i` scans the array.

Whenever `nums[i]` is different from the previous element, place it at `nums[++k]`.

### Data Structure

- Array
- Two Pointers

### Algorithm

1. If the array is empty, return `0`.
2. Initialize `k = 0`.
3. Traverse from index `1`.
4. If `nums[i] != nums[i-1]`:
   - Increment `k`.
   - Store `nums[i]` at `nums[k]`.
5. Return `k + 1`.

### Complexity

| Time | Space |
|------|-------|
| O(n) | O(1) |

---

## 🔍 Dry Run

Input

```text
[1,1,2,2,3,4,4]
```

| Step | i | k | Action | Array |
|------|---|---|--------|----------------|
| Start | - | 0 | Initial | [1,1,2,2,3,4,4] |
| 1 | 1 | 0 | Duplicate → Ignore | [1,1,2,2,3,4,4] |
| 2 | 2 | 1 | Store 2 | [1,2,2,2,3,4,4] |
| 3 | 3 | 1 | Duplicate → Ignore | [1,2,2,2,3,4,4] |
| 4 | 4 | 2 | Store 3 | [1,2,3,2,3,4,4] |
| 5 | 5 | 3 | Store 4 | [1,2,3,4,3,4,4] |
| 6 | 6 | 3 | Duplicate → Ignore | [1,2,3,4,3,4,4] |

Final Answer

```text
k = 4

nums = [1,2,3,4,...]
```

---

## ⚠️ Edge Cases

- Empty array
- Single element
- All elements are unique
- All elements are duplicates
- Large input size

---

## ❌ Common Mistakes

- Starting the loop from index `0`.
- Forgetting to return `k + 1`.
- Using extra space in the optimal solution.
- Forgetting the array is already sorted.

---

## 📚 Concepts Used

- ✅ Arrays
- ✅ Two Pointers
- ✅ In-place Algorithm

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
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int k = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

                k++;
                nums[k] = nums[i];
            }
        }

        return k + 1;
    }
}
```

---

## 📂 Folder Structure

```text
Arrays/
└── TwoPointers/
    └── RemoveDuplicatesFromSortedArray/
        ├── Solution.java
        └── README.md
```

---

## 🔗 Related Problems

- Remove Element
- Move Zeroes
- Merge Sorted Array
- Sort Array By Parity
- Remove Duplicates from Sorted Array II

---

## 🏷️ Tags

`Array` `Two Pointers` `In-place` `Sorting` `Java` `LeetCode`

---

## 👨‍💻 Author

**Gaurav Kore**

🔗 GitHub: https://github.com/GauravKore

⭐ If you found this solution helpful, consider starring the repository!
