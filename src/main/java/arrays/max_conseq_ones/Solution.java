package arrays.max_conseq_ones;

class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    int currentCount = maxCount;

    for (int num : nums) {
      if (num == 1) {
        currentCount++;
      } else {
        if (maxCount < currentCount) {
          maxCount = currentCount;
        }
        currentCount = 0;
      }
    }

    return Math.max(maxCount, currentCount);
  }
}

class Main {

  public static void main(String[] args) {
    int[][] tests = {
        {0},
        {1},
        {1, 0, 1, 1, 0},
        {1, 1, 0, 1, 1, 1},
    };
    Solution sol = new Solution();

    for (int[] test : tests) {
      System.out.println(sol.findMaxConsecutiveOnes(test));
    }
  }
}
