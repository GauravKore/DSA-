# 🔄 Remove Duplicates from Sorted Array II

## 🔗 Problem Link
👉 [LeetCode Problem](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

---

## 📌 Topic
Arrays → Two Pointers

---

## 🧠 Problem Statement
Given a sorted array `nums`, remove duplicates **in-place** such that each element appears **at most twice**.

- Return the number of valid elements `k`
- Maintain the same order
- Only the first `k` elements are considered valid

---

## 💡 Approach (Two Pointer Technique)

### 🔑 Key Idea
Since the array is sorted, duplicates are adjacent.

We allow **maximum 2 occurrences**, so:
- Start checking from index `2`
- Compare current element with `nums[k - 2]`

### ✅ Condition
```
nums[i] != nums[k - 2]
```

👉 If true → element is valid → place it at index `k`

---

## ⚙️ Code (Java)

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }

        int k = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[k - 2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
```

---

## ▶️ Example

**Input:**
```
[1,1,1,2,2,3]
```

**Output:**
```
k = 5
nums = [1,1,2,2,3,_]
```

---

## ⏱️ Complexity

| Type | Value |
|------|------|
| 🕒 Time Complexity | O(n) |
| 💾 Space Complexity | O(1) |

---

## 🚀 Key Points

- In-place modification (no extra array)
- Works only because array is **sorted**
- Allows maximum **2 duplicates**
- Efficient and optimal solution

---

## 🧪 Dry Run (Quick)

| i | nums[i] | nums[k-2] | Action |
|---|--------|-----------|--------|
| 2 | 1 | 1 | Skip |
| 3 | 2 | 1 | Keep |
| 4 | 2 | 1 | Keep |
| 5 | 3 | 2 | Keep |

---

## 🧩 Revision Trick (Very Important 🔥)

👉 Remember this line:
```
nums[i] != nums[k - 2]
```

👉 Meaning:
- Compare with **2 steps back**
- Ensures max **2 duplicates**

### 🧠 Shortcut to Recall
> "Allow 2 → Compare with k-2"

---

## 🎯 When to Use This Pattern?

Use this approach when:
- Array is **sorted**
- Need to **limit duplicates (k times)**
- Solve using **two pointers + in-place update**

---

## 📖 Conclusion

This is a classic **two-pointer problem** that teaches:
- Efficient array traversal
- In-place modification
- Interview-ready optimization

---

## ⭐ Bonus

👉 You can extend this logic:
- Allow **k duplicates** → compare with `nums[k - k]`

---

