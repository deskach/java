package arrays.sorted.dupziros;

import java.util.Arrays;

class Solution {
  private void setValue(int[] arr, int index, int val) {
    if (index < arr.length) {
      arr[index] = val;
    }
  }

  public void duplicateZeros(int[] arr) {
    int[] temp = new int[arr.length];
    int pos = 0;

    for (int it : arr) {
      setValue(temp, pos++, it);

      if (it == 0) {
        setValue(temp, pos++, it);
      }

      if (pos >= arr.length) {
        break;
      }
    }

    System.arraycopy(temp, 0, arr, 0, arr.length);
  }
}

class Main {
  private static final int[][] tests = {
      {1, 0, 2, 3, 0, 4, 5, 0},
      {1, 2, 3},
  };

  public static void main(String[] args) {
    Solution sol = new Solution();

    for (int[] test : tests) {
      sol.duplicateZeros(test);
      System.out.println(Arrays.toString(test));
    }
  }
}
