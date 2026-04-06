# 🔢 Two Sum Problem (Brute Force)

## 📌 Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of two numbers such that they add up to the target.

👉 You can assume that each input has exactly one solution.

---

## 💡 Example

**Input:**

```
nums = [2, 7, 11, 15]
target = 9
```

**Output:**

```
Indices: 0 1
```

---

## 🚀 Approach (Brute Force)

* Use two loops to check every pair
* Compare sum of each pair with target
* If match found → print indices and stop

---

## ⏱ Time & Space Complexity

* **Time Complexity:** O(n²)
* **Space Complexity:** O(1)

---

## 💻 Java Code

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
```

---

## 📚 Key Points

* Simple and easy to understand
* Works for small inputs
* Not efficient for large arrays

---

## 🔥 Future Improvement

👉 Use **HashMap** to reduce time complexity to **O(n)**

---
