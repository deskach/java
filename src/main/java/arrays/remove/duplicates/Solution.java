package arrays.remove.duplicates;

import java.util.Arrays;

// Remove Duplicates from Sorted Array
public class Solution {
  public int removeDuplicates(int[] nums) {
    int pos = 1, skipped = 0;

    while (pos + skipped < nums.length) {
      int nextItem = nums[pos + skipped];

      if (nums[pos - 1] == nextItem) {
        skipped++;
      } else {
        nums[pos] = nextItem;
        pos++;
      }
    }

    return nums.length - skipped;
  }
}

class Main {
  private static final int[][] tests = {
      {1, 1, 2},
      {0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
  };

  public static void main(String[] args) {
    Solution sol = new Solution();

    for (int[] test : tests) {
      int res = sol.removeDuplicates(test);

      System.out.printf("%s %d\n", Arrays.toString(test), res);
    }
  }
}
