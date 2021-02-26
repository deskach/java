package strings.palindrome.longest;

/*
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Example 3:
Input: s = "a"
Output: "a"

Example 4:
Input: s = "ac"
Output: "a"

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters (lower-case and/or upper-case),
 */

public class Solution {
  int maxStart = 0;
  int maxLength = 0;

  private void checkLength(int newLength, int center) {
    if (newLength > maxLength) {
      maxLength = newLength;
      if (newLength > 2) {
        maxStart = (newLength %2 == 1) ? center - (newLength - 1) / 2 : center + 1 - newLength / 2;
      } else {
        maxStart = center;
      }
    }
  }

  private int expandAroundCenter(String s, int l, int r) {
    int len = 0;

    while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
      len = r - l + 1;
      l--;
      r++;
    }

    return len;
  }

  public String longestPalindrome(String s) {
    maxStart = 0;
    maxLength = 0;
    int i;
    int len = 0;

    for (i = 0; i < s.length(); i++) {
      int len1 = expandAroundCenter(s, i, i);
      int len2 = expandAroundCenter(s, i, i + 1);
      len = Math.max(len1, len2);

      checkLength(len, i);
    }
    checkLength(len, i);

    return s.substring(maxStart, maxStart + maxLength);
  }
}
