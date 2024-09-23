
---

**Test Case 1:**  
**Test Case Name:** `ExpectZeroForEmptyInput`  
**Test Description:**  
When the input string is empty, the output should return 0.  
**Input:** `""`  
**Expected Output:** `0`

---

**Test Case 2:**  
**Test Case Name:** `ExpectZeroForSingleZero`  
**Test Description:**  
When the input string contains a single "0", the output should return 0.  
**Input:** `"0"`  
**Expected Output:** `0`

---

**Test Case 3:**  
**Test Case Name:** `ExpectSumForTwoNumbers`  
**Test Description:**  
When the input string contains two numbers separated by a comma, the output should return the sum of those numbers.  
**Input:** `"1,2"`  
**Expected Output:** `3`

---

**Test Case 4:**  
**Test Case Name:** `ExpectSumWithNewlineDelimiter`  
**Test Description:**  
When the input string contains numbers separated by a newline or comma, the output should return the sum of those numbers.  
**Input:** `"1\n2,3"`  
**Expected Output:** `6`

---

**Test Case 5:**  
**Test Case Name:** `ignoreNumbersGreaterThan1000`  
**Test Description:**  
When the input string contains numbers greater than 1000, those numbers should be ignored in the sum.  
**Input:** `"1,1001"`  
**Expected Output:** `1`

---

**Test Case 6:**  
**Test Case Name:** `ExpectSumWithCustomDelimiter`  
**Test Description:**  
When the input string starts with a custom delimiter, the output should return the sum of numbers separated by the custom delimiter.  
**Input:** `"//;\n1;2"`  
**Expected Output:** `3`

---

