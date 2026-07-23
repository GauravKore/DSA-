/*
Author : Gaurav Kore
Language : Java
Platform : LeetCode
Problem : 412. Fizz Buzz
*/
/*
===============================================================================
                          LEETCODE 412 - FIZZ BUZZ
===============================================================================

Difficulty : Easy
Topic      : Math, Simulation
Link       : https://leetcode.com/problems/fizz-buzz/

===============================================================================
1. PROBLEM STATEMENT
===============================================================================

Given an integer n, return a string array answer (1-indexed) where:

• answer[i] == "FizzBuzz" if i is divisible by both 3 and 5.
• answer[i] == "Fizz" if i is divisible only by 3.
• answer[i] == "Buzz" if i is divisible only by 5.
• Otherwise, answer[i] == i (as a string).

Return the resulting list.

===============================================================================
2. CONSTRAINTS
===============================================================================

1 <= n <= 10^4

===============================================================================
3. EXAMPLES
===============================================================================

Example 1

Input:
n = 3

Output:
["1","2","Fizz"]

------------------------------------------------------------

Example 2

Input:
n = 5

Output:
["1","2","Fizz","4","Buzz"]

------------------------------------------------------------

Example 3

Input:
n = 15

Output:
[
"1",
"2",
"Fizz",
"4",
"Buzz",
"Fizz",
"7",
"8",
"Fizz",
"Buzz",
"11",
"Fizz",
"13",
"14",
"FizzBuzz"
]

===============================================================================
4. OBSERVATION / PATTERN RECOGNITION
===============================================================================

We only need to check divisibility.

If number is divisible by:

3 and 5  → FizzBuzz

3 only    → Fizz

5 only    → Buzz

Otherwise → Number itself

Important:

Always check "FizzBuzz" FIRST.

Why?

15 is divisible by both 3 and 5.

If we check 3 first,

15 becomes "Fizz"

and we never reach "FizzBuzz".

===============================================================================
5. INTUITION
===============================================================================

Loop from 1 to n.

For every number,

check divisibility using modulo operator (%)

Store the corresponding string in the answer list.

===============================================================================
6. ALGORITHM
===============================================================================

Step 1

Create an empty List<String>

--------------------------------

Step 2

Loop from 1 to n

--------------------------------

Step 3

If number is divisible by both 3 and 5

Add "FizzBuzz"

--------------------------------

Else If divisible by 3

Add "Fizz"

--------------------------------

Else If divisible by 5

Add "Buzz"

--------------------------------

Else

Convert number into String

Store it

--------------------------------

Step 4

Return the list

===============================================================================
7. DRY RUN
===============================================================================

Input

n = 5

Initially

answer = [ ]

--------------------------------

i = 1

Not divisible by 3 or 5

answer

[1]

--------------------------------

i = 2

answer

[1,2]

--------------------------------

i = 3

Divisible by 3

answer

[1,2,Fizz]

--------------------------------

i = 4

answer

[1,2,Fizz,4]

--------------------------------

i = 5

Divisible by 5

answer

[1,2,Fizz,4,Buzz]

--------------------------------

Final Answer

["1","2","Fizz","4","Buzz"]

===============================================================================
8. EDGE CASES
===============================================================================

n = 1

Output

["1"]

--------------------------------

n = 3

Output

["1","2","Fizz"]

--------------------------------

n = 5

Output

["1","2","Fizz","4","Buzz"]

--------------------------------

n = 15

Last value becomes

FizzBuzz

===============================================================================
9. TIME COMPLEXITY
===============================================================================

Loop runs exactly n times.

Time Complexity:

O(n)

===============================================================================
10. SPACE COMPLEXITY
===============================================================================

Answer list stores n strings.

Space Complexity:

O(n)

===============================================================================
11. INTERVIEW TIPS
===============================================================================

✓ Always check

Divisible by BOTH

before checking individually.

Wrong Order

if(i % 3 == 0)
else if(i % 5 == 0)
else if(i % 15 == 0)

Correct Order

if(i % 15 == 0)
else if(i % 3 == 0)
else if(i % 5 == 0)

===============================================================================
12. KEY LEARNING
===============================================================================

✓ Modulo Operator (%)

✓ Divisibility

✓ Loops

✓ Conditional Statements

✓ List<String>

✓ Integer to String Conversion

===============================================================================
13. JAVA SOLUTION
===============================================================================
*/

import java.util.*;

class Solution {

    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0) {
                answer.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                answer.add("Fizz");
            }
            else if (i % 5 == 0) {
                answer.add("Buzz");
            }
            else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}

/*
===============================================================================
14. ALTERNATIVE APPROACHES
===============================================================================

1. String Builder Approach
2. Using Concatenation
3. Switch Expression (Java 17+)

Current solution is the most readable and interview-friendly.

===============================================================================
15. RELATED PROBLEMS
===============================================================================

• Happy Number
• Power of Three
• Ugly Number
• Count Primes
• Perfect Number

===============================================================================
*/
