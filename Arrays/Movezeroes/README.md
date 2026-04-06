# 🚀 Move Zeroes

## 🔗 Problem Link
👉 [LeetCode Problem](https://leetcode.com/problems/move-zeroes/)

---

## 📌 Topic
Arrays → Two Pointers

---

## 🧠 Problem Statement
Given an integer array `nums`, move all `0`s to the end of the array while maintaining the **relative order of non-zero elements**.

- Perform the operation **in-place**
- Do not use extra space

---

## 💡 Approach (Two Pointer Technique)

### 🔑 Key Idea
- Move all **non-zero elements to the front**
- Fill remaining positions with `0`

---

### 🪜 Steps
1. Use pointer `k = 0`
2. Traverse array:
   - If element ≠ 0 → place at `nums[k]`, increment `k`
3. After loop:
   - Fill remaining positions with `0`

---

## ⚙️ Code (Java)

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;

        // Step 1: Move non-zero elements forward
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }

        // Step 2: Fill remaining positions with zero
        while(k < nums.length){
            nums[k] = 0;
            k++;
        }
    }
}
```

---

## ▶️ Example

**Input:**
```
[0,1,0,3,12]
```

**Output:**
```
[1,3,12,0,0]
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
- Maintains order of non-zero elements
- Efficient single traversal
- Classic **two-pointer problem**

---

## 🧪 Dry Run (Quick)

| i | nums[i] | Action | Array State |
|---|--------|--------|-------------|
| 0 | 0 | Skip | [0,1,0,3,12] |
| 1 | 1 | Move to front | [1,1,0,3,12] |
| 2 | 0 | Skip | [1,1,0,3,12] |
| 3 | 3 | Move | [1,3,0,3,12] |
| 4 | 12 | Move | [1,3,12,3,12] |

Final → Fill zeros → `[1,3,12,0,0]`

---

## 🧩 Revision Trick (🔥 Easy Recall)

👉 Remember:
```
Non-zero → front  
Zero → end
```

👉 Or:
> "Push non-zero forward, fill rest with zero"

---

## 🎯 When to Use This Pattern?

Use this when:
- Need to **rearrange array in-place**
- Maintain **relative order**
- Separate elements based on condition

---

## 📖 Conclusion

This problem is a simple yet important example of the **two-pointer technique** and helps in mastering in-place array manipulation.

---

