/*
===============================================================================
                     LEETCODE 191 - NUMBER OF 1 BITS
===============================================================================

Author      : Gaurav Kore
Language    : Java
Platform    : LeetCode

Difficulty  : Easy
Topic       : Bit Manipulation

Problem Link:
https://leetcode.com/problems/number-of-1-bits/

===============================================================================
1. PROBLEM STATEMENT
===============================================================================

Write a function that takes an unsigned integer and returns the number
of '1' bits it has (also known as the Hamming Weight).

In simple words,

Count how many bits are set to 1 in the binary representation
of the given number.

===============================================================================
2. CONSTRAINTS
===============================================================================

Input is a 32-bit unsigned integer.

===============================================================================
3. EXAMPLES
===============================================================================

Example 1

Input

n = 11

Binary

1011

Output

3

Explanation

1011 contains three 1's.

------------------------------------------------------------

Example 2

Input

n = 128

Binary

10000000

Output

1

------------------------------------------------------------

Example 3

Input

n = 2147483645

Binary

1111111111111111111111111111101

Output

30

===============================================================================
4. OBSERVATION / PATTERN RECOGNITION
===============================================================================

Whenever we perform

n & 1

we get the LAST bit.

Examples

1011 & 0001 = 1

1010 & 0001 = 0

Therefore,

if (n & 1) == 1

then the last bit is set.

Count it.

Then remove that bit by shifting the number right.

Repeat until all 32 bits are processed.

===============================================================================
5. INTUITION
===============================================================================

Read one bit at a time.

Count every 1.

Move to the next bit.

Repeat until every bit has been checked.

===============================================================================
6. BRUTE FORCE APPROACH
===============================================================================

Loop exactly 32 times.

Each iteration

1. Check last bit using

n & 1

2. Increase count if bit is 1.

3. Shift number right.

Simple and easy.

===============================================================================
7. OPTIMAL APPROACH
===============================================================================

Instead of checking all 32 bits,

remove one set bit in every iteration.

Formula

n = n & (n - 1)

This removes the rightmost set bit.

Loop runs only as many times as there are 1's.

Much faster when the number contains fewer set bits.

===============================================================================
8. ALGORITHM (BRUTE FORCE)
===============================================================================

Step 1

count = 0

--------------------------------

Step 2

Repeat 32 times

--------------------------------

Extract last bit

bit = n & 1

--------------------------------

If bit == 1

count++

--------------------------------

Shift right

n >>>= 1

--------------------------------

Return count

===============================================================================
9. DRY RUN
===============================================================================

Input

n = 11

Binary

1011

--------------------------------

Iteration 1

1011

Last Bit

1

count = 1

Shift

0101

--------------------------------

Iteration 2

0101

Last Bit

1

count = 2

Shift

0010

--------------------------------

Iteration 3

0010

Last Bit

0

count = 2

Shift

0001

--------------------------------

Iteration 4

0001

Last Bit

1

count = 3

Shift

0000

--------------------------------

Final Answer

3

===============================================================================
10. EDGE CASES
===============================================================================

n = 0

Binary

0000

Answer

0

--------------------------------

n = 1

Binary

0001

Answer

1

--------------------------------

n = 15

Binary

1111

Answer

4

--------------------------------

All bits are 1

Answer

32

===============================================================================
11. TIME COMPLEXITY
===============================================================================

Brute Force

O(32)

Since 32 is constant,

it is also considered

O(1)

Optimal Approach

O(Number of Set Bits)

===============================================================================
12. SPACE COMPLEXITY
===============================================================================

O(1)

===============================================================================
13. INTERVIEW TIPS
===============================================================================

Always use

>>>

instead of

>>

because the problem treats the input as an unsigned integer.

Remember

n & 1

checks the last bit.

n >>> 1

moves to the next bit.

===============================================================================
14. COMMON MISTAKES
===============================================================================

❌ Using >>

Negative numbers may never become zero.

Always use

>>>

--------------------------------

❌ Forgetting to count only when

(n & 1) == 1

--------------------------------

❌ Confusing

&

with

&&

===============================================================================
15. KEY LEARNING
===============================================================================

✓ Binary Numbers

✓ Bitwise AND

✓ Unsigned Right Shift

✓ Counting Set Bits

✓ Loops

✓ Bit Manipulation Fundamentals

===============================================================================
16. JAVA SOLUTION (BRUTE FORCE)
===============================================================================
*/

class Solution {

    public int hammingWeight(int n) {

        int count = 0;

        for (int i = 0; i < 32; i++) {

            if ((n & 1) == 1) {
                count++;
            }

            n >>>= 1;
        }

        return count;
    }
}

/*
===============================================================================
17. OPTIMAL SOLUTION (Brian Kernighan's Algorithm)
===============================================================================

Idea

Every iteration removes one set bit.

Example

101100

↓

101000

↓

100000

↓

000000

Loop runs only three times.

Code

class Solution {

    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            n = n & (n - 1);

            count++;
        }

        return count;
    }
}

===============================================================================
18. WHY IS THE OPTIMAL APPROACH BETTER?
===============================================================================

Suppose

Binary

10000000000000000000000000000000

Only one bit is set.

Brute Force

Checks all 32 bits.

Optimal

Runs only once.

===============================================================================
19. RELATED PROBLEMS
===============================================================================

✓ Counting Bits

✓ Single Number

✓ Reverse Bits

✓ Number Complement

✓ Power of Two

✓ Missing Number

===============================================================================
