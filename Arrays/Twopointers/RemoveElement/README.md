# 🔹 27. Remove Element

## 🔗 Problem Link
https://leetcode.com/problems/remove-element/

---

## 🧠 Problem Statement
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` **in-place**.

- Return the number of elements `k` which are **not equal to val**
- First `k` elements should contain valid values
- Order **can change**
- Remaining elements are not important

---

## 💡 Approach (Two Pointer)

### Idea:
- Use two pointers:
  - `i` → traverse array
  - `k` → place valid elements

---

## 🔹 Step-by-Step Algorithm
1. Initialize `k = 0`
2. Traverse array from `i = 0` to `n-1`
3. If `nums[i] != val`:
   - Assign `nums[k] = nums[i]`
   - Increment `k`
4. Return `k`

---

## ✍️ Code (Java)

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
🔍 Dry Run
Input:

nums = [3,2,2,3], val = 3

Steps:
i	nums[i]	Action	k	Array
0	3	skip	0	[3,2,2,3]
1	2	nums[0]=2	1	[2,2,2,3]
2	2	nums[1]=2	2	[2,2,2,3]
3	3	skip	2	[2,2,2,3]
✅ Output

k = 2
nums = [2,2,...]

⏱️ Time & Space Complexity
Time Complexity: O(n)
Space Complexity: O(1) (in-place)
🔥 Key Points (Quick Revision)
Two Pointer Pattern
Works in-place (no extra memory)
Similar Problems:
Move Zeroes
Remove Duplicates
⚡ Easy Trick to Remember

👉 “Keep elements NOT equal to val, skip rest”


