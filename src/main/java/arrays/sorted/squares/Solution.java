package arrays.sorted.squares;

import java.util.Arrays;

class Solution {
  public int[] sortedSquares(int[] nums) {
    int result[] = Arrays.copyOf(nums, nums.length);

    for (int i = 0; i < result.length; i++) {
      result[i] *= result[i];
    }

    return Arrays.stream(result).sorted().toArray();
  }
}

class Main {
  private static final int[][] tests = {
      {-7, -3, 2, 3, 11},
      {-4, -1, 0, 3, 10}
  };

  public static void main(String[] args) {
    Solution sol = new Solution();

    for (int[] test : tests) {
      System.out.println(Arrays.toString(sol.sortedSquares(test)));
    }
  }
}