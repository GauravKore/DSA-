# 🚀 LeetCode 283 - Move Zeroes

![Java](https://img.shields.io/badge/Language-Java-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

🔗 **Problem Link:** https://leetcode.com/problems/move-zeroes/

---

# 📖 Problem Statement

Given an integer array `nums`, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

You must do this **in-place** without making a copy of the array.

### Example

**Input**
```text
nums = [0,1,0,3,12]
```

**Output**
```text
[1,3,12,0,0]
```

**Explanation**

All non-zero elements remain in their original order, and all zeroes are moved to the end.

---

# 💡 Intuition

- Zeroes don't need to stay where they are.
- Keep all non-zero elements at the beginning.
- Fill the remaining positions with zeroes.
- Since the operation must be in-place, use the Two Pointer technique.

---

# 🚀 Approach 1 - Brute Force

## Idea

Create a new array.

- Copy all non-zero elements.
- Fill the remaining positions with zeroes.
- Copy the result back into the original array.

## Algorithm

1. Create a temporary array.
2. Traverse the original array.
3. Store all non-zero elements.
4. Fill remaining positions with zeroes.
5. Copy back to the original array.

## Complexity

| Time | Space |
|------|-------|
| O(n) | O(n) |

---

# ⭐ Approach 2 - Optimal (Two Pointers)

## Idea

Maintain a pointer `k` that always points to the position where the next non-zero element should be placed.

Whenever a non-zero element is found:

- Swap it with `nums[k]`.
- Increment `k`.

This automatically moves all zeroes towards the end.

## Data Structure

- Array
- Two Pointers

## Algorithm

1. Initialize `k = 0`.
2. Traverse the array.
3. If the current element is non-zero:
   - Swap `nums[i]` with `nums[k]`.
   - Increment `k`.
4. Continue until the end.

## Complexity

| Time | Space |
|------|-------|
| O(n) | O(1) |

---

# 🔍 Dry Run

Input

```text
[0,1,0,3,12]
```

| Step | i | k | Array |
|------|---|---|----------------|
| Start | - | 0 | [0,1,0,3,12] |
| 1 | 0 | 0 | Zero → Ignore |
| 2 | 1 | 0 | Swap → [1,0,0,3,12] |
| 3 | 2 | 1 | Zero → Ignore |
| 4 | 3 | 1 | Swap → [1,3,0,0,12] |
| 5 | 4 | 2 | Swap → [1,3,12,0,0] |

Final Answer

```text
[1,3,12,0,0]
```

---

# ⚠️ Edge Cases

- Empty array
- Single element
- All elements are zero
- No zero present
- Zero at the beginning
- Zero at the end
- Multiple consecutive zeroes

---

# ❌ Common Mistakes

- Creating another array in the optimal solution.
- Forgetting to increment `k`.
- Swapping every element instead of only non-zero elements.
- Losing the relative order of non-zero elements.

---

# 📚 Concepts Used

- ✅ Arrays
- ✅ Two Pointers
- ✅ In-place Algorithm
- ✅ Swapping

---

# 📈 Complexity Analysis

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n) | O(n) |
| Optimal | O(n) | O(1) |

---

# 💻 Java Solution

```java
class Solution {
    public void moveZeroes(int[] nums) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                k++;
            }
        }
    }
}
```

---

# 📂 Folder Structure

```text
Arrays/
└── TwoPointers/
    └── MoveZeroes/
        ├── Solution.java
        └── README.md
```

---

# 🔗 Related Problems

- Remove Duplicates from Sorted Array
- Remove Element
- Sort Array By Parity
- Squares of a Sorted Array
- Merge Sorted Array

---

# 🏷️ Tags

`Array` `Two Pointers` `In-place` `Java` `LeetCode`

---

# 👨‍💻 Author

**Gaurav Kore**

🔗 GitHub: https://github.com/GauravKore

⭐ If you found this solution helpful, consider starring the repository!
