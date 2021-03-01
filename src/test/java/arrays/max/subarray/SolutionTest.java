package arrays.max.subarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TestCase {
  int sum;
  int[] arr;

  public TestCase(int sum, int[] arr) {
    this.sum = sum;
    this.arr = arr;
  }
}

class SolutionTest {
  TestCase[] testCases = {
      new TestCase(6, new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}),
      new TestCase(1, new int[]{1}),
      new TestCase(0, new int[]{0}),
      new TestCase(-1, new int[]{-1}),
      new TestCase(-100, new int[]{-100}),
  };

  @Test
  void maxSubArray() {
    Solution sol = new Solution();

    for (TestCase tc : testCases) {
      int res = sol.maxSubArray(tc.arr);

      Assertions.assertEquals(
          tc.sum,
          res,
          String.format("%s => %d != %d", Arrays.toString(tc.arr), res, tc.sum)
      );
    }
  }
}