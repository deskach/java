package arrays.remove.element;

import java.util.Arrays;

/* Remove Element */
public class Solution {
  public int removeElement(int[] nums, int val) {
    int pos = 0, size = nums.length;

    while (pos < size) {
      while (nums[pos] == val && pos < size) {
        nums[pos] = nums[size - 1];
        size--;
      }
      pos++;
    }

    return size;
  }
}

class TestItem {
  public int[] arr;
  public int val;

  TestItem(int[] arr, int val) {
    this.arr = arr;
    this.val = val;
  }
}

class Main {
  private static final TestItem[] tests = {
      new TestItem(new int[]{3, 2, 2, 3}, 3),
      new TestItem(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2),
      new TestItem(new int[]{3, 3}, 3),
  };

  public static void main(String[] args) {
    Solution sol = new Solution();

    for (TestItem test : tests) {
      int res = sol.removeElement(test.arr, test.val);

      System.out.printf("%s %d\n", Arrays.toString(test.arr), res);
    }
  }
}