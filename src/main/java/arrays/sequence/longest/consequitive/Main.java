package arrays.sequence.longest.consequitive;

import java.util.Arrays;

class Main {
  private static final int[][] tests = {
      {0, 3, 7, 2, 5, 8, 4, 6, 0, 1},
      {100, 4, 200, 1, 3, 2},
      {1, 2, 0, 1},
      {},
  };

  public static void main(String[] args) {
    Solution sol = new MySolution();

    for (int[] test : tests) {
      int res = sol.longestConsecutive(test);

      System.out.printf("%s %d\n", Arrays.toString(test), res);
    }
  }
}
