# 🔄 Remove Duplicates from Sorted Array II
## 🔗 Problem Link
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

## 📌 Topic
Arrays → Two Pointers

---

## 🧠 Problem
Given a sorted array `nums`, remove duplicates in-place such that each element appears at most **twice**.

Return the number of valid elements `k`.

---

## 💡 Approach (Two Pointers)

- Since array is sorted, duplicates are adjacent
- Maintain pointer `k = 2`
- Start from index `2`
- Compare:
  
  nums[i] != nums[k - 2]

- If true → place element at index `k`

---

## ⚙️ Code

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

Input:
```
[1,1,1,2,2,3]
```

Output:
```
k = 5
[1,1,2,2,3]
```

---

## ⏱️ Complexity

- Time: O(n)
- Space: O(1)

---

## 🚀 Key Points

- In-place modification
- Efficient for sorted arrays
- Allows maximum 2 duplicates
- Uses two-pointer technique

---

## 🏁 How to Run

```
javac Solution.java
java Main
```

---

## 📖 Conclusion

This is a classic **two-pointer problem** that helps in understanding in-place array manipulation efficiently.
