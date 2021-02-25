package arrays.sum.two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {
  class TestCase {
    int arr[];
    int target;
    int expected[];

    public TestCase(int[] arr, int target, int[] expected) {
      this.arr = arr;
      this.target = target;
      this.expected = expected;
    }
  }

  TestCase[] testCases = {
      new TestCase(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
      new TestCase(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
      new TestCase(new int[]{3, 3}, 6, new int[]{0, 1}),
  };

  @Test
  void twoSum() {
    Solution sol = new Solution();

    for (TestCase tc : testCases) {
      int[] res = sol.twoSum(tc.arr, tc.target);

      Assertions.assertArrayEquals(
          res,
          tc.expected,
          Arrays.toString(tc.arr) + ": " + Arrays.toString(res) + " != " + Arrays.toString(tc.expected)
      );
    }
  }
}