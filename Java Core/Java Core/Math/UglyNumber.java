/*
===============================================================================
                           LEETCODE 263 - UGLY NUMBER
===============================================================================

Difficulty : Easy
Topic      : Math, Loops
Link       : https://leetcode.com/problems/ugly-number/

------------------------------------------------------------------------------
PROBLEM STATEMENT
------------------------------------------------------------------------------

An ugly number is a positive integer whose prime factors are limited to
only 2, 3, and 5.

Given an integer n, return true if n is an ugly number.
Otherwise, return false.

------------------------------------------------------------------------------
EXAMPLES
------------------------------------------------------------------------------

Example 1:

Input:
n = 6

Output:
true

Explanation:
6 = 2 × 3
Only prime factors are 2 and 3.

------------------------------------------------

Example 2:

Input:
n = 8

Output:
true

Explanation:
8 = 2 × 2 × 2

------------------------------------------------

Example 3:

Input:
n = 14

Output:
false

Explanation:
14 = 2 × 7

Since 7 is present,
14 is NOT an ugly number.

------------------------------------------------------------------------------
OBSERVATION
------------------------------------------------------------------------------

An ugly number can contain ONLY these prime factors:

2
3
5

Idea:

Keep removing these factors.

If after removing all possible 2s, 3s and 5s,
the remaining number becomes 1,

then every prime factor was either
2, 3 or 5.

Otherwise,
some other prime factor exists.

------------------------------------------------------------------------------
APPROACH
------------------------------------------------------------------------------

Step 1

If n <= 0

Return false.

------------------------------------------------

Step 2

Remove every factor of 2.

Example:

24

↓

12

↓

6

↓

3

------------------------------------------------

Step 3

Remove every factor of 3.

3

↓

1

------------------------------------------------

Step 4

Remove every factor of 5.

(if possible)

------------------------------------------------

Step 5

If remaining number == 1

Return true

Else

Return false

------------------------------------------------------------------------------
DRY RUN
------------------------------------------------------------------------------

Input

n = 30

--------------------------------

Initial

n = 30

--------------------------------

Divide by 2

30 / 2 = 15

n = 15

--------------------------------

Divide by 3

15 / 3 = 5

n = 5

--------------------------------

Divide by 5

5 / 5 = 1

n = 1

--------------------------------

Answer

true

==============================================================================

Another Example

Input

n = 14

--------------------------------

Initial

14

--------------------------------

Divide by 2

14 / 2 = 7

--------------------------------

Can divide by 2?

No

--------------------------------

Can divide by 3?

No

--------------------------------

Can divide by 5?

No

Remaining number

7

7 != 1

Answer

false

------------------------------------------------------------------------------
EDGE CASES
------------------------------------------------------------------------------

n = -5

false

--------------------------------

n = 0

false

--------------------------------

n = 1

true

--------------------------------

n = 2

true

--------------------------------

n = 25

true

--------------------------------

n = 49

false

------------------------------------------------------------------------------
TIME COMPLEXITY
------------------------------------------------------------------------------

Worst Case:

Repeatedly dividing the number

Time Complexity:

O(log n)

------------------------------------------------------------------------------
SPACE COMPLEXITY
------------------------------------------------------------------------------

O(1)

------------------------------------------------------------------------------
LEARNING
------------------------------------------------------------------------------

✔ While Loop

✔ Modulo Operator (%)

✔ Division

✔ Prime Factors

✔ Mathematical Simulation

✔ Edge Case Handling

===============================================================================
*/

class Solution {

    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }
}
