# Find Words That Can Be Formed by Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of strings `words` and a string `chars`.

A string is  **good**  if it can be formed by characters from `chars` (each character can only be used once for  **each**  word in `words`).

Return  *the sum of lengths of all good strings in words*.

 

 **Example 1:** 

```
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

```

 **Example 2:** 

```
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

```

 

 **Constraints:** 

- 1 <= words.length <= 1000
- 1 <= words[i].length, chars.length <= 100
- words[i] and chars consist of lowercase English letters.

## Solution

**Language:** C++  
**Runtime:** 111 ms (beats 15.95%)  
**Memory:** 50.8 MB (beats 23.86%)  
**Submitted:** 2026-10-03T13:19:01.474Z  

```cpp
class Solution {
public:
    int countCharacters(std::vector<std::string>& words, std::string chars) {
        std::unordered_map<char, int> charCount;
        for (char c : chars) {
            charCount[c]++;
        }
        
        int totalLength = 0;
        
        for (const std::string& word : words) {
            std::unordered_map<char, int> tempCount = charCount;
            bool canForm = true;
            
            for (char c : word) {
                if (tempCount[c] > 0) {
                    tempCount[c]--;
                } else {
                    canForm = false;
                    break;
                }
            }
            
            if (canForm) {
                totalLength += word.length();
            }
        }
        
        return totalLength;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/)