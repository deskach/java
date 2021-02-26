package strings.reverse;

/*
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input
array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

class Solution {
  private boolean swap(int pos1, int pos2, char[] chars) {
    if (pos1 >= 0 && pos1 <= chars.length && pos2 >= 0 && pos2 < chars.length && pos1 != pos2) {
      char tmp = chars[pos1];
      chars[pos1] = chars[pos2];
      chars[pos2] = tmp;

      return true;
    }

    return false;
  }

  public void reverseString(char[] s) {
    for (int i = 0; i < Math.floor(s.length / 2.0); i++) {
      swap(i, s.length - i - 1, s);
    }
  }
}