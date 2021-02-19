package remove_all_adjacent_duplicates_in_string;

import java.util.Stack;

class Solution {
  private String toString(Stack<Character> chars) {
    StringBuilder sb = new StringBuilder();

    while (chars.size() > 0) {
      sb.insert(0, chars.pop());
    }

    return sb.toString();
  }

  public String removeDuplicates(String str) {
    Character[] input = str.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
    Stack<Character> chars = new Stack<>();

    for (Character ch : input) {
      chars.push(ch);
      boolean isRemoveHappen = false;

      do {
        isRemoveHappen = false;

        if (chars.size() > 1) {
          Character ch0 = chars.pop();

          if (ch0 == chars.peek()) {
            chars.pop();
            isRemoveHappen = true;
          } else {
            chars.push(ch0);
          }
        }
      } while (isRemoveHappen);
    }

    return toString(chars);
  }
}

class Main {
  public static void main(String[] args) {
    String str0 = "abbaca";
    Solution sol = new Solution();
    System.out.println(sol.removeDuplicates(str0));
  }
}