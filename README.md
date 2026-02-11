# Evaluate Reverse Polish Notation (LeetCode #150)

## Problem Description
The goal is to evaluate an arithmetic expression in **Reverse Polish Notation** (RPN). In this notation, operators follow their operands.

**Key Rules:**
- Valid operators are `+`, `-`, `*`, and `/`.
- Division must **truncate toward zero**.
- The expression is guaranteed to be valid and fit within a 32-bit integer.

## Complexity Analysis
- **Time Complexity:** $O(n)$, where $n$ is the number of tokens. We process each token exactly once.
- **Space Complexity:** $O(n)$ in the worst case to store operands in the stack.

## Solution Approach
We use a **Stack** to store integers:
1. Iterate through each token.
2. If the token is an **operator**, pop the top two elements from the stack.
   - The first pop is the **right operand** ($b$).
   - The second pop is the **left operand** ($a$).
   - Perform the operation ($a \text{ op } b$) and push the result back.
3. If the token is a **number**, parse it and push it onto the stack.
4. The final result remains as the last element in the stack.
