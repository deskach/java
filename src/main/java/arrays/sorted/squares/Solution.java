package arrays.sorted.squares;

import java.util.Arrays;

class Solution {
  public int[] sortedSquares(int[] nums) {
    return Arrays.stream(nums).map(e -> e*e).sorted().toArray();
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