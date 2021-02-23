package arrays.sorted.merge;

import java.util.Arrays;

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] temp = new int[nums1.length];
    int nums1Pos = 0, nums2Pos = 0;

    while (nums1Pos + nums2Pos < m + n) {
      if (nums1Pos < m && nums2Pos < n) {
        if (nums1[nums1Pos] < nums2[nums2Pos]) {
          temp[nums1Pos + nums2Pos] = nums1[nums1Pos];
          nums1Pos++;
        } else {
          temp[nums1Pos + nums2Pos] = nums2[nums2Pos];
          nums2Pos++;
        }
      } else if (nums1Pos < m) {
        temp[nums1Pos + nums2Pos] = nums1[nums1Pos];
        nums1Pos++;
      } else {
        temp[nums1Pos + nums2Pos] = nums2[nums2Pos];
        nums2Pos++;
      }
    }

    System.arraycopy(temp, 0, nums1, 0, m + n);
  }
}

class TestItem {
  public int[] arr;
  public int size;

  TestItem(int[] arr, int size) {
    this.arr = arr;
    this.size = size;
  }
}

class Main {
  private static final TestItem[][] tests = {
      {
          new TestItem(new int[]{1, 2, 3, 0, 0, 0}, 3),
          new TestItem(new int[]{2, 3, 6}, 3),
      },
  };

  public static void main(String[] args) {
    Solution sol = new Solution();

    for (TestItem[] test : tests) {
      sol.merge(test[0].arr, test[0].size, test[1].arr, test[1].size);
      System.out.println(Arrays.toString(test[0].arr));
    }
  }
}
