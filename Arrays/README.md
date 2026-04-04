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
public class Twosumexample{
    public static void main(String[] args) {
        int nums[] = {2 , 7 , 11 , 15 };
        int target = 9 ;
        int n = nums.length ;

        for(int i = 0 ; i < n ; i++){
            for ( int j = i+1 ; j < n ; j++){
                if ( nums[i] + nums[j] == target){
                       System.out.println("Indices: " + i + " " + j);
                       return ;
                }
            }
        }
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
